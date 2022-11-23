package nl.inholland.exams.ships._577208sandernederstigt.Service;

import lombok.AllArgsConstructor;
import nl.inholland.exams.ships._577208sandernederstigt.Models.DTO.ManufacturerDTO;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Manufacturer;
import nl.inholland.exams.ships._577208sandernederstigt.Repository.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class ManufacturerService {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    /*public ManufacturerService(ManufacturerRepository manufacturerRepository) {
        this.manufacturerRepository = manufacturerRepository;
    }*/

    public List<Manufacturer> getAllManufacturers(){
        return manufacturerRepository.findAll();
    }

    public Manufacturer addNewManufacturer(ManufacturerDTO manufacturerDTO){

        if(manufacturerRepository.findByName(manufacturerDTO.getName()) == null) {
            Manufacturer manufacturer = new Manufacturer(manufacturerDTO.getId(), manufacturerDTO.getName(), manufacturerDTO.getAffiliation(), manufacturerDTO.getCeo());
            /*manufacturer.setId(manufacturerDTO.getId());
            manufacturer.setName(manufacturerDTO.getName());
            manufacturer.setAffiliation(manufacturerDTO.getAffiliation());
            manufacturer.setCeo(manufacturerDTO.getCeo());*/
            return manufacturerRepository.save(manufacturer);

        }
        else{
            throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Manufacturer name is already in use!");
        }

    }
}

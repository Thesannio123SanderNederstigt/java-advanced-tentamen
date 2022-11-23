package nl.inholland.exams.ships._577208sandernederstigt.Service;

import lombok.AllArgsConstructor;
import nl.inholland.exams.ships._577208sandernederstigt.Models.DTO.ShipDTO;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Manufacturer;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Ship;
import nl.inholland.exams.ships._577208sandernederstigt.Repository.ManufacturerRepository;
import nl.inholland.exams.ships._577208sandernederstigt.Repository.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ShipService {

    @Autowired
    private ShipRepository shipRepository;

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    /*public ShipService(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }*/

    @Autowired
    private ManufacturerService manufacturerService;

    public List<Ship> getAllShips(){
        return shipRepository.findAll();
    }

    public Ship addShip(ShipDTO shipDTO){
        Manufacturer manufacturer = manufacturerRepository.findByName(shipDTO.getManufacturerName());
        Ship ship = new Ship(shipDTO.getName(), manufacturer, shipDTO.getType(), shipDTO.getLength(), shipDTO.getCost());
        ship.setManufacturer(manufacturer);
        return shipRepository.save(ship);
    }


}

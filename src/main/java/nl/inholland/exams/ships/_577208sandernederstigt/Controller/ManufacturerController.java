package nl.inholland.exams.ships._577208sandernederstigt.Controller;

import lombok.AllArgsConstructor;
import nl.inholland.exams.ships._577208sandernederstigt.Models.DTO.ManufacturerDTO;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Manufacturer;
import nl.inholland.exams.ships._577208sandernederstigt.Service.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("manufacturers")
@AllArgsConstructor
public class ManufacturerController {

    @Autowired
    private ManufacturerService manufacturerService;

    @GetMapping
    public List<Manufacturer> getManufacturers(){ return manufacturerService.getAllManufacturers();}

    @PostMapping
    public Manufacturer addManufacturer(@RequestBody ManufacturerDTO manufacturerDTO){ return manufacturerService.addNewManufacturer(manufacturerDTO);}

    //@GetMapping()

}

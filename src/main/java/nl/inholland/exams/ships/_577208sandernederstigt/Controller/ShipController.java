package nl.inholland.exams.ships._577208sandernederstigt.Controller;

import lombok.AllArgsConstructor;
import nl.inholland.exams.ships._577208sandernederstigt.Models.DTO.ShipDTO;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Ship;
import nl.inholland.exams.ships._577208sandernederstigt.Service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ships")
@AllArgsConstructor
public class ShipController {

    @Autowired
    private ShipService shipService;

    @GetMapping
    public List<Ship> getShips(){ return shipService.getAllShips();}

    @PostMapping
    public Ship addNewShip(@RequestBody ShipDTO shipDTO){ return shipService.addShip(shipDTO);}

}

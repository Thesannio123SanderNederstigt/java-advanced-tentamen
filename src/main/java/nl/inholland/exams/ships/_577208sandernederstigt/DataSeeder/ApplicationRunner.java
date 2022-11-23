package nl.inholland.exams.ships._577208sandernederstigt.DataSeeder;

import lombok.AllArgsConstructor;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Manufacturer;
import nl.inholland.exams.ships._577208sandernederstigt.Models.Ship;
import nl.inholland.exams.ships._577208sandernederstigt.Repository.ManufacturerRepository;
import nl.inholland.exams.ships._577208sandernederstigt.Repository.ShipRepository;
import nl.inholland.exams.ships._577208sandernederstigt.Service.ManufacturerService;
import nl.inholland.exams.ships._577208sandernederstigt.Service.ShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class ApplicationRunner implements org.springframework.boot.ApplicationRunner {

    @Autowired
    private ManufacturerService manufacturerService;

    @Autowired
    private ShipService shipService;

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Autowired
    private ShipRepository shipRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception{

        Manufacturer firstManufacturer = new Manufacturer(1000001L,"Corellian Engineering Corporation","Rebel Alliance","Corran Destt");
        //firstManufacturer.setId(1000001L);
        manufacturerRepository.save(firstManufacturer);

        Manufacturer secondManufacturer = new Manufacturer(1000002L,"Kuat Drive Yards","Galactic Republic","Kuat of Kuat");
        //secondManufacturer.setId(1000002L);
        manufacturerRepository.save(secondManufacturer);

        Manufacturer thirdManufacturer = new Manufacturer(1000003L,"Sienar Fleet Systems","Galactic Republic","Raith Sienar");
        //thirdManufacturer.setId(1000003L);
        manufacturerRepository.save(thirdManufacturer);

        Ship firstShip = new Ship("CR90", firstManufacturer, "Corvette", 150.0, 2700000L);
        //firstShip.setManufacturer(firstManufacturer);
        shipRepository.save(firstShip);

        Ship secondShip = new Ship("Executor",secondManufacturer,"Dreadnought",19000.0,325000000L);
        shipRepository.save(secondShip);

        Ship thirdShip = new Ship("TIE",thirdManufacturer,"Fighter",6.3,60000L);
        shipRepository.save(thirdShip);

        Ship fourthShip = new Ship(        "Lambda",thirdManufacturer,"Shuttle",20.0,140000L);
        shipRepository.save(fourthShip);

    }

}

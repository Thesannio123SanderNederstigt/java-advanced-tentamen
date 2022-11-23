package nl.inholland.exams.ships._577208sandernederstigt.Repository;

import nl.inholland.exams.ships._577208sandernederstigt.Models.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
    Manufacturer findByName(String manufacturerName);
}

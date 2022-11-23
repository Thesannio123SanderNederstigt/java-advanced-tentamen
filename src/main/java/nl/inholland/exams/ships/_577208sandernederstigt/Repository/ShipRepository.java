package nl.inholland.exams.ships._577208sandernederstigt.Repository;

import nl.inholland.exams.ships._577208sandernederstigt.Models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipRepository extends JpaRepository<Ship, Long> {

}

package nl.inholland.exams.ships._577208sandernederstigt.Models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ship {

    private @Id @GeneratedValue Long id;

    private String name;

    @JsonBackReference
    @ManyToOne
    private Manufacturer manufacturer;

    private String type;

    private Double length;

    private Long cost;

    public Ship(String name, Manufacturer manufacturer, String type, Double length, Long cost) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.length = length;
        this.cost = cost;
    }
}

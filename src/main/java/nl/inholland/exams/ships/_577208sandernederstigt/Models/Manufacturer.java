package nl.inholland.exams.ships._577208sandernederstigt.Models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manufacturer {

    @Id
    private Long id;

    private String name;

    private String affiliation;

    private String ceo;

    @JsonManagedReference
    @OneToMany(mappedBy = "manufacturer")
    private Set<Ship> ships;

    public Manufacturer(Long id, String name, String affiliation, String ceo) {
        this.id = id;
        this.name = name;
        this.affiliation = affiliation;
        this.ceo = ceo;
    }
}

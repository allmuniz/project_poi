package project.poi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_points_of_interest")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PointOfInterestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Long x;

    private Long y;

    public PointOfInterestEntity(String name, Long x, Long y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}

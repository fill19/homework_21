package cursor.homework_21;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "films")
@NoArgsConstructor
@Data
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String genre;

    private String name;

    public Film(String genre, String name) {
        this.genre = genre;
        this.name = name;
    }

}

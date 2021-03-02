package cursor.homework_21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    private final Repository repository;

    @Autowired
    public Controller(Repository infoRepository) {
        this.repository = infoRepository;
    }

    @GetMapping(value = "/info")
    public List<Film> getFilm() {
        return repository.findAll();
    }
}
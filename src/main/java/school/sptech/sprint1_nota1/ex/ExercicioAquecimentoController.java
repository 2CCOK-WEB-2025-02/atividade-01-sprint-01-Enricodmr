package school.sptech.sprint1_nota1.ex;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioAquecimentoController {

    @GetMapping("/ex-00/{n}")
    public Boolean exercicioAquecimento(@PathVariable int n) {
        return n % 2 == 0;
    }
}

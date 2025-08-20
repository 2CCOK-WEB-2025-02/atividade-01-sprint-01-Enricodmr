package school.sptech.sprint1_nota1.ex2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExercicioMedioController {

    @GetMapping("/ex-02/{n}")
    public Boolean exercicioMedio(@PathVariable int n) {
        if (n <= 1){
            return false;
        }else {
            for (int i = 2; i < n; i++){
                if (n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}

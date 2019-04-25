package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FjwtsdjplvController {

    private final FjwtsdjplvService fjwtsdjplvService;

    public FjwtsdjplvController(FjwtsdjplvService fjwtsdjplvService) {
        this.fjwtsdjplvService = fjwtsdjplvService;
    }

    @RequestMapping("/fjwtsdjplv")
    public String index() {
        return fjwtsdjplvService.getGreeting();
    }

}

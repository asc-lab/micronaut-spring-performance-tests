package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OwagpwmgsoController {

    private final OwagpwmgsoService owagpwmgsoService;

    public OwagpwmgsoController(OwagpwmgsoService owagpwmgsoService) {
        this.owagpwmgsoService = owagpwmgsoService;
    }

    @RequestMapping("/owagpwmgso")
    public String index() {
        return owagpwmgsoService.getGreeting();
    }

}

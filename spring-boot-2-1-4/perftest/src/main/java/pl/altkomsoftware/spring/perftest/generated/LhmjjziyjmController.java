package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LhmjjziyjmController {

    private final LhmjjziyjmService lhmjjziyjmService;

    public LhmjjziyjmController(LhmjjziyjmService lhmjjziyjmService) {
        this.lhmjjziyjmService = lhmjjziyjmService;
    }

    @RequestMapping("/lhmjjziyjm")
    public String index() {
        return lhmjjziyjmService.getGreeting();
    }

}

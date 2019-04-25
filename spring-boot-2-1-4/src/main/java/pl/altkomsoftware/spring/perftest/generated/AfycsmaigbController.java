package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AfycsmaigbController {

    private final AfycsmaigbService afycsmaigbService;

    public AfycsmaigbController(AfycsmaigbService afycsmaigbService) {
        this.afycsmaigbService = afycsmaigbService;
    }

    @RequestMapping("/afycsmaigb")
    public String index() {
        return afycsmaigbService.getGreeting();
    }

}

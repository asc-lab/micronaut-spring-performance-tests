package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DrshqefxhkController {

    private final DrshqefxhkService drshqefxhkService;

    public DrshqefxhkController(DrshqefxhkService drshqefxhkService) {
        this.drshqefxhkService = drshqefxhkService;
    }

    @RequestMapping("/drshqefxhk")
    public String index() {
        return drshqefxhkService.getGreeting();
    }

}

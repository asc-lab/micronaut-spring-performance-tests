package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LqttdvcrjkController {

    private final LqttdvcrjkService lqttdvcrjkService;

    public LqttdvcrjkController(LqttdvcrjkService lqttdvcrjkService) {
        this.lqttdvcrjkService = lqttdvcrjkService;
    }

    @RequestMapping("/lqttdvcrjk")
    public String index() {
        return lqttdvcrjkService.getGreeting();
    }

}

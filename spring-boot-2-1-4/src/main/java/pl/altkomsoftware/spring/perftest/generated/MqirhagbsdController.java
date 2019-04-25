package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MqirhagbsdController {

    private final MqirhagbsdService mqirhagbsdService;

    public MqirhagbsdController(MqirhagbsdService mqirhagbsdService) {
        this.mqirhagbsdService = mqirhagbsdService;
    }

    @RequestMapping("/mqirhagbsd")
    public String index() {
        return mqirhagbsdService.getGreeting();
    }

}

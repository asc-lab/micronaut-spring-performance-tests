package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EssalbliqbController {

    private final EssalbliqbService essalbliqbService;

    public EssalbliqbController(EssalbliqbService essalbliqbService) {
        this.essalbliqbService = essalbliqbService;
    }

    @RequestMapping("/essalbliqb")
    public String index() {
        return essalbliqbService.getGreeting();
    }

}

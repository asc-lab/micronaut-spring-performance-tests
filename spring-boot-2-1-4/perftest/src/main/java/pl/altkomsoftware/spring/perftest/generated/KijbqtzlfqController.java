package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KijbqtzlfqController {

    private final KijbqtzlfqService kijbqtzlfqService;

    public KijbqtzlfqController(KijbqtzlfqService kijbqtzlfqService) {
        this.kijbqtzlfqService = kijbqtzlfqService;
    }

    @RequestMapping("/kijbqtzlfq")
    public String index() {
        return kijbqtzlfqService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LojwhmpawzController {

    private final LojwhmpawzService lojwhmpawzService;

    public LojwhmpawzController(LojwhmpawzService lojwhmpawzService) {
        this.lojwhmpawzService = lojwhmpawzService;
    }

    @RequestMapping("/lojwhmpawz")
    public String index() {
        return lojwhmpawzService.getGreeting();
    }

}

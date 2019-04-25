package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GuqeheslqzController {

    private final GuqeheslqzService guqeheslqzService;

    public GuqeheslqzController(GuqeheslqzService guqeheslqzService) {
        this.guqeheslqzService = guqeheslqzService;
    }

    @RequestMapping("/guqeheslqz")
    public String index() {
        return guqeheslqzService.getGreeting();
    }

}

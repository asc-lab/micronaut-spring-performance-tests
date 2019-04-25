package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RuqpzqokkpController {

    private final RuqpzqokkpService ruqpzqokkpService;

    public RuqpzqokkpController(RuqpzqokkpService ruqpzqokkpService) {
        this.ruqpzqokkpService = ruqpzqokkpService;
    }

    @RequestMapping("/ruqpzqokkp")
    public String index() {
        return ruqpzqokkpService.getGreeting();
    }

}

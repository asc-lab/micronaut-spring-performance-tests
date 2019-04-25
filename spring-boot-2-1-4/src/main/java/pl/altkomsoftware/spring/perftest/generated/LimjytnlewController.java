package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LimjytnlewController {

    private final LimjytnlewService limjytnlewService;

    public LimjytnlewController(LimjytnlewService limjytnlewService) {
        this.limjytnlewService = limjytnlewService;
    }

    @RequestMapping("/limjytnlew")
    public String index() {
        return limjytnlewService.getGreeting();
    }

}

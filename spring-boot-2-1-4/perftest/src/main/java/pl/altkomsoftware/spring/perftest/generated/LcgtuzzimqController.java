package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LcgtuzzimqController {

    private final LcgtuzzimqService lcgtuzzimqService;

    public LcgtuzzimqController(LcgtuzzimqService lcgtuzzimqService) {
        this.lcgtuzzimqService = lcgtuzzimqService;
    }

    @RequestMapping("/lcgtuzzimq")
    public String index() {
        return lcgtuzzimqService.getGreeting();
    }

}

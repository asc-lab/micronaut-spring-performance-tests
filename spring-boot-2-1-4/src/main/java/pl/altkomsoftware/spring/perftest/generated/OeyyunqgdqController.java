package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OeyyunqgdqController {

    private final OeyyunqgdqService oeyyunqgdqService;

    public OeyyunqgdqController(OeyyunqgdqService oeyyunqgdqService) {
        this.oeyyunqgdqService = oeyyunqgdqService;
    }

    @RequestMapping("/oeyyunqgdq")
    public String index() {
        return oeyyunqgdqService.getGreeting();
    }

}

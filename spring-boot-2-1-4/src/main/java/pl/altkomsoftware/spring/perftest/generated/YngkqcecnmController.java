package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YngkqcecnmController {

    private final YngkqcecnmService yngkqcecnmService;

    public YngkqcecnmController(YngkqcecnmService yngkqcecnmService) {
        this.yngkqcecnmService = yngkqcecnmService;
    }

    @RequestMapping("/yngkqcecnm")
    public String index() {
        return yngkqcecnmService.getGreeting();
    }

}

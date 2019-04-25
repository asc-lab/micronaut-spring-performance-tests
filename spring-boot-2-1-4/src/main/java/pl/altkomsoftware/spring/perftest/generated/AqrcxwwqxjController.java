package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AqrcxwwqxjController {

    private final AqrcxwwqxjService aqrcxwwqxjService;

    public AqrcxwwqxjController(AqrcxwwqxjService aqrcxwwqxjService) {
        this.aqrcxwwqxjService = aqrcxwwqxjService;
    }

    @RequestMapping("/aqrcxwwqxj")
    public String index() {
        return aqrcxwwqxjService.getGreeting();
    }

}

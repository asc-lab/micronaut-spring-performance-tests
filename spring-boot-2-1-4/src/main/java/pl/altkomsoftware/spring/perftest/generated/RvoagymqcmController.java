package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RvoagymqcmController {

    private final RvoagymqcmService rvoagymqcmService;

    public RvoagymqcmController(RvoagymqcmService rvoagymqcmService) {
        this.rvoagymqcmService = rvoagymqcmService;
    }

    @RequestMapping("/rvoagymqcm")
    public String index() {
        return rvoagymqcmService.getGreeting();
    }

}

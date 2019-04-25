package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HdwwinjmwmController {

    private final HdwwinjmwmService hdwwinjmwmService;

    public HdwwinjmwmController(HdwwinjmwmService hdwwinjmwmService) {
        this.hdwwinjmwmService = hdwwinjmwmService;
    }

    @RequestMapping("/hdwwinjmwm")
    public String index() {
        return hdwwinjmwmService.getGreeting();
    }

}

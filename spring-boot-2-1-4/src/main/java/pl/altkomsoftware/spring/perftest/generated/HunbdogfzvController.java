package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HunbdogfzvController {

    private final HunbdogfzvService hunbdogfzvService;

    public HunbdogfzvController(HunbdogfzvService hunbdogfzvService) {
        this.hunbdogfzvService = hunbdogfzvService;
    }

    @RequestMapping("/hunbdogfzv")
    public String index() {
        return hunbdogfzvService.getGreeting();
    }

}

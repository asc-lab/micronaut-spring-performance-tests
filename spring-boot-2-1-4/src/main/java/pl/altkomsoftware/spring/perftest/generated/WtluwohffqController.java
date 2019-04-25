package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WtluwohffqController {

    private final WtluwohffqService wtluwohffqService;

    public WtluwohffqController(WtluwohffqService wtluwohffqService) {
        this.wtluwohffqService = wtluwohffqService;
    }

    @RequestMapping("/wtluwohffq")
    public String index() {
        return wtluwohffqService.getGreeting();
    }

}

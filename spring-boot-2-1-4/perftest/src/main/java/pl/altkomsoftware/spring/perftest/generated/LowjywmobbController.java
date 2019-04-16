package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LowjywmobbController {

    private final LowjywmobbService lowjywmobbService;

    public LowjywmobbController(LowjywmobbService lowjywmobbService) {
        this.lowjywmobbService = lowjywmobbService;
    }

    @RequestMapping("/lowjywmobb")
    public String index() {
        return lowjywmobbService.getGreeting();
    }

}

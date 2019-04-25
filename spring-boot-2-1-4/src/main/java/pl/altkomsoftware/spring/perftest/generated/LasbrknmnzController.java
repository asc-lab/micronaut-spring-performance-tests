package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LasbrknmnzController {

    private final LasbrknmnzService lasbrknmnzService;

    public LasbrknmnzController(LasbrknmnzService lasbrknmnzService) {
        this.lasbrknmnzService = lasbrknmnzService;
    }

    @RequestMapping("/lasbrknmnz")
    public String index() {
        return lasbrknmnzService.getGreeting();
    }

}

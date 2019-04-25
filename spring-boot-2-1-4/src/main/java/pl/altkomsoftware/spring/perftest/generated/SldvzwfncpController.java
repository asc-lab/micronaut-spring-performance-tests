package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SldvzwfncpController {

    private final SldvzwfncpService sldvzwfncpService;

    public SldvzwfncpController(SldvzwfncpService sldvzwfncpService) {
        this.sldvzwfncpService = sldvzwfncpService;
    }

    @RequestMapping("/sldvzwfncp")
    public String index() {
        return sldvzwfncpService.getGreeting();
    }

}

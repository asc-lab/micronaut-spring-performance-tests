package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SmuqlicgexController {

    private final SmuqlicgexService smuqlicgexService;

    public SmuqlicgexController(SmuqlicgexService smuqlicgexService) {
        this.smuqlicgexService = smuqlicgexService;
    }

    @RequestMapping("/smuqlicgex")
    public String index() {
        return smuqlicgexService.getGreeting();
    }

}

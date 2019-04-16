package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FeuxwhobusController {

    private final FeuxwhobusService feuxwhobusService;

    public FeuxwhobusController(FeuxwhobusService feuxwhobusService) {
        this.feuxwhobusService = feuxwhobusService;
    }

    @RequestMapping("/feuxwhobus")
    public String index() {
        return feuxwhobusService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DjjsilfnedController {

    private final DjjsilfnedService djjsilfnedService;

    public DjjsilfnedController(DjjsilfnedService djjsilfnedService) {
        this.djjsilfnedService = djjsilfnedService;
    }

    @RequestMapping("/djjsilfned")
    public String index() {
        return djjsilfnedService.getGreeting();
    }

}

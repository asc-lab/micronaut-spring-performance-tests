package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HygpauhrjqController {

    private final HygpauhrjqService hygpauhrjqService;

    public HygpauhrjqController(HygpauhrjqService hygpauhrjqService) {
        this.hygpauhrjqService = hygpauhrjqService;
    }

    @RequestMapping("/hygpauhrjq")
    public String index() {
        return hygpauhrjqService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EnfqmxerhuController {

    private final EnfqmxerhuService enfqmxerhuService;

    public EnfqmxerhuController(EnfqmxerhuService enfqmxerhuService) {
        this.enfqmxerhuService = enfqmxerhuService;
    }

    @RequestMapping("/enfqmxerhu")
    public String index() {
        return enfqmxerhuService.getGreeting();
    }

}

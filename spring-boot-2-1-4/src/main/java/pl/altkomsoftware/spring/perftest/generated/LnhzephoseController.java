package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LnhzephoseController {

    private final LnhzephoseService lnhzephoseService;

    public LnhzephoseController(LnhzephoseService lnhzephoseService) {
        this.lnhzephoseService = lnhzephoseService;
    }

    @RequestMapping("/lnhzephose")
    public String index() {
        return lnhzephoseService.getGreeting();
    }

}

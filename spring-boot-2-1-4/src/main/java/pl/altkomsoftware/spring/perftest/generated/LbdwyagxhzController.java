package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LbdwyagxhzController {

    private final LbdwyagxhzService lbdwyagxhzService;

    public LbdwyagxhzController(LbdwyagxhzService lbdwyagxhzService) {
        this.lbdwyagxhzService = lbdwyagxhzService;
    }

    @RequestMapping("/lbdwyagxhz")
    public String index() {
        return lbdwyagxhzService.getGreeting();
    }

}

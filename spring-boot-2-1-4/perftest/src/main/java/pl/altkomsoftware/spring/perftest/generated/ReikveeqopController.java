package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ReikveeqopController {

    private final ReikveeqopService reikveeqopService;

    public ReikveeqopController(ReikveeqopService reikveeqopService) {
        this.reikveeqopService = reikveeqopService;
    }

    @RequestMapping("/reikveeqop")
    public String index() {
        return reikveeqopService.getGreeting();
    }

}

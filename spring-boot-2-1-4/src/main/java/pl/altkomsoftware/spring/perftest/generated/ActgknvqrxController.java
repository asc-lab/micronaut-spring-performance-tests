package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ActgknvqrxController {

    private final ActgknvqrxService actgknvqrxService;

    public ActgknvqrxController(ActgknvqrxService actgknvqrxService) {
        this.actgknvqrxService = actgknvqrxService;
    }

    @RequestMapping("/actgknvqrx")
    public String index() {
        return actgknvqrxService.getGreeting();
    }

}

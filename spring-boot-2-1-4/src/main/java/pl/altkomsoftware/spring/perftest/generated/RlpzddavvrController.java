package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RlpzddavvrController {

    private final RlpzddavvrService rlpzddavvrService;

    public RlpzddavvrController(RlpzddavvrService rlpzddavvrService) {
        this.rlpzddavvrService = rlpzddavvrService;
    }

    @RequestMapping("/rlpzddavvr")
    public String index() {
        return rlpzddavvrService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PulqxtvuyrController {

    private final PulqxtvuyrService pulqxtvuyrService;

    public PulqxtvuyrController(PulqxtvuyrService pulqxtvuyrService) {
        this.pulqxtvuyrService = pulqxtvuyrService;
    }

    @RequestMapping("/pulqxtvuyr")
    public String index() {
        return pulqxtvuyrService.getGreeting();
    }

}

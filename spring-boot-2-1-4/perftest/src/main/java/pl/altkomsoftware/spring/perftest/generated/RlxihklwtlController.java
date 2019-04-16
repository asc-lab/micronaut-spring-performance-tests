package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RlxihklwtlController {

    private final RlxihklwtlService rlxihklwtlService;

    public RlxihklwtlController(RlxihklwtlService rlxihklwtlService) {
        this.rlxihklwtlService = rlxihklwtlService;
    }

    @RequestMapping("/rlxihklwtl")
    public String index() {
        return rlxihklwtlService.getGreeting();
    }

}

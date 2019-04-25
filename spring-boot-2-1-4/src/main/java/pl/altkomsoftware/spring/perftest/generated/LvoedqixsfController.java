package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LvoedqixsfController {

    private final LvoedqixsfService lvoedqixsfService;

    public LvoedqixsfController(LvoedqixsfService lvoedqixsfService) {
        this.lvoedqixsfService = lvoedqixsfService;
    }

    @RequestMapping("/lvoedqixsf")
    public String index() {
        return lvoedqixsfService.getGreeting();
    }

}

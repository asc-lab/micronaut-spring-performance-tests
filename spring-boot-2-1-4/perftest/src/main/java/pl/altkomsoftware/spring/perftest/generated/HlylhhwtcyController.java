package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HlylhhwtcyController {

    private final HlylhhwtcyService hlylhhwtcyService;

    public HlylhhwtcyController(HlylhhwtcyService hlylhhwtcyService) {
        this.hlylhhwtcyService = hlylhhwtcyService;
    }

    @RequestMapping("/hlylhhwtcy")
    public String index() {
        return hlylhhwtcyService.getGreeting();
    }

}

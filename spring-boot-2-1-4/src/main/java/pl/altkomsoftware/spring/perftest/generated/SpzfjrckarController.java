package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SpzfjrckarController {

    private final SpzfjrckarService spzfjrckarService;

    public SpzfjrckarController(SpzfjrckarService spzfjrckarService) {
        this.spzfjrckarService = spzfjrckarService;
    }

    @RequestMapping("/spzfjrckar")
    public String index() {
        return spzfjrckarService.getGreeting();
    }

}

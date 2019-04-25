package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HcjrswmhueController {

    private final HcjrswmhueService hcjrswmhueService;

    public HcjrswmhueController(HcjrswmhueService hcjrswmhueService) {
        this.hcjrswmhueService = hcjrswmhueService;
    }

    @RequestMapping("/hcjrswmhue")
    public String index() {
        return hcjrswmhueService.getGreeting();
    }

}

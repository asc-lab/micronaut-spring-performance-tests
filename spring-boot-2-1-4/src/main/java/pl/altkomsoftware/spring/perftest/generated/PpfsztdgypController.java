package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PpfsztdgypController {

    private final PpfsztdgypService ppfsztdgypService;

    public PpfsztdgypController(PpfsztdgypService ppfsztdgypService) {
        this.ppfsztdgypService = ppfsztdgypService;
    }

    @RequestMapping("/ppfsztdgyp")
    public String index() {
        return ppfsztdgypService.getGreeting();
    }

}

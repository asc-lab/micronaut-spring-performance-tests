package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MhzlavlbuaController {

    private final MhzlavlbuaService mhzlavlbuaService;

    public MhzlavlbuaController(MhzlavlbuaService mhzlavlbuaService) {
        this.mhzlavlbuaService = mhzlavlbuaService;
    }

    @RequestMapping("/mhzlavlbua")
    public String index() {
        return mhzlavlbuaService.getGreeting();
    }

}

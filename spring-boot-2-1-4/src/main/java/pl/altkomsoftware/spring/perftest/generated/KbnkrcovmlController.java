package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KbnkrcovmlController {

    private final KbnkrcovmlService kbnkrcovmlService;

    public KbnkrcovmlController(KbnkrcovmlService kbnkrcovmlService) {
        this.kbnkrcovmlService = kbnkrcovmlService;
    }

    @RequestMapping("/kbnkrcovml")
    public String index() {
        return kbnkrcovmlService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KbgedqfjslController {

    private final KbgedqfjslService kbgedqfjslService;

    public KbgedqfjslController(KbgedqfjslService kbgedqfjslService) {
        this.kbgedqfjslService = kbgedqfjslService;
    }

    @RequestMapping("/kbgedqfjsl")
    public String index() {
        return kbgedqfjslService.getGreeting();
    }

}

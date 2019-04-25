package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KplkeqmlaiController {

    private final KplkeqmlaiService kplkeqmlaiService;

    public KplkeqmlaiController(KplkeqmlaiService kplkeqmlaiService) {
        this.kplkeqmlaiService = kplkeqmlaiService;
    }

    @RequestMapping("/kplkeqmlai")
    public String index() {
        return kplkeqmlaiService.getGreeting();
    }

}

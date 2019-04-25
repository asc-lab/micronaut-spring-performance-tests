package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KizqkbmredController {

    private final KizqkbmredService kizqkbmredService;

    public KizqkbmredController(KizqkbmredService kizqkbmredService) {
        this.kizqkbmredService = kizqkbmredService;
    }

    @RequestMapping("/kizqkbmred")
    public String index() {
        return kizqkbmredService.getGreeting();
    }

}

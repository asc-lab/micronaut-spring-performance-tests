package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KysdexjtzyController {

    private final KysdexjtzyService kysdexjtzyService;

    public KysdexjtzyController(KysdexjtzyService kysdexjtzyService) {
        this.kysdexjtzyService = kysdexjtzyService;
    }

    @RequestMapping("/kysdexjtzy")
    public String index() {
        return kysdexjtzyService.getGreeting();
    }

}

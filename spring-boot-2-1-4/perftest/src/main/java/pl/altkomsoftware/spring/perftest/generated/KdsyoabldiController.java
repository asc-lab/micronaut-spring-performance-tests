package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KdsyoabldiController {

    private final KdsyoabldiService kdsyoabldiService;

    public KdsyoabldiController(KdsyoabldiService kdsyoabldiService) {
        this.kdsyoabldiService = kdsyoabldiService;
    }

    @RequestMapping("/kdsyoabldi")
    public String index() {
        return kdsyoabldiService.getGreeting();
    }

}

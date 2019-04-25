package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WcmtqusactController {

    private final WcmtqusactService wcmtqusactService;

    public WcmtqusactController(WcmtqusactService wcmtqusactService) {
        this.wcmtqusactService = wcmtqusactService;
    }

    @RequestMapping("/wcmtqusact")
    public String index() {
        return wcmtqusactService.getGreeting();
    }

}

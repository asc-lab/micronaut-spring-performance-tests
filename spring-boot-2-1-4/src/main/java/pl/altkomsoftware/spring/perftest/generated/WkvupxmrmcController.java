package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WkvupxmrmcController {

    private final WkvupxmrmcService wkvupxmrmcService;

    public WkvupxmrmcController(WkvupxmrmcService wkvupxmrmcService) {
        this.wkvupxmrmcService = wkvupxmrmcService;
    }

    @RequestMapping("/wkvupxmrmc")
    public String index() {
        return wkvupxmrmcService.getGreeting();
    }

}

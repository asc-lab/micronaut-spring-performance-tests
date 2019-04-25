package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WoanctyemsController {

    private final WoanctyemsService woanctyemsService;

    public WoanctyemsController(WoanctyemsService woanctyemsService) {
        this.woanctyemsService = woanctyemsService;
    }

    @RequestMapping("/woanctyems")
    public String index() {
        return woanctyemsService.getGreeting();
    }

}

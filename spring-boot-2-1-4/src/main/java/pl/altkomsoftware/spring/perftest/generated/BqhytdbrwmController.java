package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BqhytdbrwmController {

    private final BqhytdbrwmService bqhytdbrwmService;

    public BqhytdbrwmController(BqhytdbrwmService bqhytdbrwmService) {
        this.bqhytdbrwmService = bqhytdbrwmService;
    }

    @RequestMapping("/bqhytdbrwm")
    public String index() {
        return bqhytdbrwmService.getGreeting();
    }

}

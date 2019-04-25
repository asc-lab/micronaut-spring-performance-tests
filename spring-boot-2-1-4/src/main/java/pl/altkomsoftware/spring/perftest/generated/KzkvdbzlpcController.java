package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KzkvdbzlpcController {

    private final KzkvdbzlpcService kzkvdbzlpcService;

    public KzkvdbzlpcController(KzkvdbzlpcService kzkvdbzlpcService) {
        this.kzkvdbzlpcService = kzkvdbzlpcService;
    }

    @RequestMapping("/kzkvdbzlpc")
    public String index() {
        return kzkvdbzlpcService.getGreeting();
    }

}

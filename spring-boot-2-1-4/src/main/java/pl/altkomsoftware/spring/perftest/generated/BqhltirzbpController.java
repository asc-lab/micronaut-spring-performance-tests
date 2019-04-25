package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BqhltirzbpController {

    private final BqhltirzbpService bqhltirzbpService;

    public BqhltirzbpController(BqhltirzbpService bqhltirzbpService) {
        this.bqhltirzbpService = bqhltirzbpService;
    }

    @RequestMapping("/bqhltirzbp")
    public String index() {
        return bqhltirzbpService.getGreeting();
    }

}

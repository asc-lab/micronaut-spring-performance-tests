package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BeidnyaydnController {

    private final BeidnyaydnService beidnyaydnService;

    public BeidnyaydnController(BeidnyaydnService beidnyaydnService) {
        this.beidnyaydnService = beidnyaydnService;
    }

    @RequestMapping("/beidnyaydn")
    public String index() {
        return beidnyaydnService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BtsejcknviController {

    private final BtsejcknviService btsejcknviService;

    public BtsejcknviController(BtsejcknviService btsejcknviService) {
        this.btsejcknviService = btsejcknviService;
    }

    @RequestMapping("/btsejcknvi")
    public String index() {
        return btsejcknviService.getGreeting();
    }

}

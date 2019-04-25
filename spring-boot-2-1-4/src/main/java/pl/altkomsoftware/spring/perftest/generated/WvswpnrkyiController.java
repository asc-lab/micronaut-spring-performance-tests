package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WvswpnrkyiController {

    private final WvswpnrkyiService wvswpnrkyiService;

    public WvswpnrkyiController(WvswpnrkyiService wvswpnrkyiService) {
        this.wvswpnrkyiService = wvswpnrkyiService;
    }

    @RequestMapping("/wvswpnrkyi")
    public String index() {
        return wvswpnrkyiService.getGreeting();
    }

}

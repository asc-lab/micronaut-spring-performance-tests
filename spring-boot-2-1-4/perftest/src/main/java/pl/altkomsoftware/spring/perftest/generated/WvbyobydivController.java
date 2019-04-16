package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WvbyobydivController {

    private final WvbyobydivService wvbyobydivService;

    public WvbyobydivController(WvbyobydivService wvbyobydivService) {
        this.wvbyobydivService = wvbyobydivService;
    }

    @RequestMapping("/wvbyobydiv")
    public String index() {
        return wvbyobydivService.getGreeting();
    }

}

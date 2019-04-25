package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XpkzwbephdController {

    private final XpkzwbephdService xpkzwbephdService;

    public XpkzwbephdController(XpkzwbephdService xpkzwbephdService) {
        this.xpkzwbephdService = xpkzwbephdService;
    }

    @RequestMapping("/xpkzwbephd")
    public String index() {
        return xpkzwbephdService.getGreeting();
    }

}

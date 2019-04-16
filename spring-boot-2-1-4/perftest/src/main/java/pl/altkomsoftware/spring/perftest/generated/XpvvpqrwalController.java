package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XpvvpqrwalController {

    private final XpvvpqrwalService xpvvpqrwalService;

    public XpvvpqrwalController(XpvvpqrwalService xpvvpqrwalService) {
        this.xpvvpqrwalService = xpvvpqrwalService;
    }

    @RequestMapping("/xpvvpqrwal")
    public String index() {
        return xpvvpqrwalService.getGreeting();
    }

}

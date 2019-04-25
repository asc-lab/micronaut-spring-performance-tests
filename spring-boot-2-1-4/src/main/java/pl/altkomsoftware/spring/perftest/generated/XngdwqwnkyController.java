package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XngdwqwnkyController {

    private final XngdwqwnkyService xngdwqwnkyService;

    public XngdwqwnkyController(XngdwqwnkyService xngdwqwnkyService) {
        this.xngdwqwnkyService = xngdwqwnkyService;
    }

    @RequestMapping("/xngdwqwnky")
    public String index() {
        return xngdwqwnkyService.getGreeting();
    }

}

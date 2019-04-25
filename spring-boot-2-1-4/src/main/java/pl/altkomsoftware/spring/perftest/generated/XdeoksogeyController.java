package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XdeoksogeyController {

    private final XdeoksogeyService xdeoksogeyService;

    public XdeoksogeyController(XdeoksogeyService xdeoksogeyService) {
        this.xdeoksogeyService = xdeoksogeyService;
    }

    @RequestMapping("/xdeoksogey")
    public String index() {
        return xdeoksogeyService.getGreeting();
    }

}

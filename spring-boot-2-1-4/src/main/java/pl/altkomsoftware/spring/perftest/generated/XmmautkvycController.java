package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XmmautkvycController {

    private final XmmautkvycService xmmautkvycService;

    public XmmautkvycController(XmmautkvycService xmmautkvycService) {
        this.xmmautkvycService = xmmautkvycService;
    }

    @RequestMapping("/xmmautkvyc")
    public String index() {
        return xmmautkvycService.getGreeting();
    }

}

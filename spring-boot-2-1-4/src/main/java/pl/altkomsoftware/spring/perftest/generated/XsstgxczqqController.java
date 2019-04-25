package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XsstgxczqqController {

    private final XsstgxczqqService xsstgxczqqService;

    public XsstgxczqqController(XsstgxczqqService xsstgxczqqService) {
        this.xsstgxczqqService = xsstgxczqqService;
    }

    @RequestMapping("/xsstgxczqq")
    public String index() {
        return xsstgxczqqService.getGreeting();
    }

}

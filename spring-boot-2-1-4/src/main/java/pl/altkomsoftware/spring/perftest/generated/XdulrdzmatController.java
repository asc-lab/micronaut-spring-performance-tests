package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XdulrdzmatController {

    private final XdulrdzmatService xdulrdzmatService;

    public XdulrdzmatController(XdulrdzmatService xdulrdzmatService) {
        this.xdulrdzmatService = xdulrdzmatService;
    }

    @RequestMapping("/xdulrdzmat")
    public String index() {
        return xdulrdzmatService.getGreeting();
    }

}

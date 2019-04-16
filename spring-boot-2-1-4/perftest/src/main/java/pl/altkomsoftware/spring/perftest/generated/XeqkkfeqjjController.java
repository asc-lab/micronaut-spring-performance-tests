package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XeqkkfeqjjController {

    private final XeqkkfeqjjService xeqkkfeqjjService;

    public XeqkkfeqjjController(XeqkkfeqjjService xeqkkfeqjjService) {
        this.xeqkkfeqjjService = xeqkkfeqjjService;
    }

    @RequestMapping("/xeqkkfeqjj")
    public String index() {
        return xeqkkfeqjjService.getGreeting();
    }

}

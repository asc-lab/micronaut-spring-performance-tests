package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XqeyvspzsxController {

    private final XqeyvspzsxService xqeyvspzsxService;

    public XqeyvspzsxController(XqeyvspzsxService xqeyvspzsxService) {
        this.xqeyvspzsxService = xqeyvspzsxService;
    }

    @RequestMapping("/xqeyvspzsx")
    public String index() {
        return xqeyvspzsxService.getGreeting();
    }

}

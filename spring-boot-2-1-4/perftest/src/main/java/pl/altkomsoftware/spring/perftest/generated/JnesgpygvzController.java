package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JnesgpygvzController {

    private final JnesgpygvzService jnesgpygvzService;

    public JnesgpygvzController(JnesgpygvzService jnesgpygvzService) {
        this.jnesgpygvzService = jnesgpygvzService;
    }

    @RequestMapping("/jnesgpygvz")
    public String index() {
        return jnesgpygvzService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WyvivwxcvrController {

    private final WyvivwxcvrService wyvivwxcvrService;

    public WyvivwxcvrController(WyvivwxcvrService wyvivwxcvrService) {
        this.wyvivwxcvrService = wyvivwxcvrService;
    }

    @RequestMapping("/wyvivwxcvr")
    public String index() {
        return wyvivwxcvrService.getGreeting();
    }

}

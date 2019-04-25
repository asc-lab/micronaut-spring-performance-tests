package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XqzmuhmishController {

    private final XqzmuhmishService xqzmuhmishService;

    public XqzmuhmishController(XqzmuhmishService xqzmuhmishService) {
        this.xqzmuhmishService = xqzmuhmishService;
    }

    @RequestMapping("/xqzmuhmish")
    public String index() {
        return xqzmuhmishService.getGreeting();
    }

}

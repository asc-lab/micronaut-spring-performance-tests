package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XpxtvqxwhzController {

    private final XpxtvqxwhzService xpxtvqxwhzService;

    public XpxtvqxwhzController(XpxtvqxwhzService xpxtvqxwhzService) {
        this.xpxtvqxwhzService = xpxtvqxwhzService;
    }

    @RequestMapping("/xpxtvqxwhz")
    public String index() {
        return xpxtvqxwhzService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XpboafzxfeController {

    private final XpboafzxfeService xpboafzxfeService;

    public XpboafzxfeController(XpboafzxfeService xpboafzxfeService) {
        this.xpboafzxfeService = xpboafzxfeService;
    }

    @RequestMapping("/xpboafzxfe")
    public String index() {
        return xpboafzxfeService.getGreeting();
    }

}

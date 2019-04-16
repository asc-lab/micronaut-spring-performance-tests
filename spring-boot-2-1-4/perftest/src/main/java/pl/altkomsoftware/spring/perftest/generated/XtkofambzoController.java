package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XtkofambzoController {

    private final XtkofambzoService xtkofambzoService;

    public XtkofambzoController(XtkofambzoService xtkofambzoService) {
        this.xtkofambzoService = xtkofambzoService;
    }

    @RequestMapping("/xtkofambzo")
    public String index() {
        return xtkofambzoService.getGreeting();
    }

}

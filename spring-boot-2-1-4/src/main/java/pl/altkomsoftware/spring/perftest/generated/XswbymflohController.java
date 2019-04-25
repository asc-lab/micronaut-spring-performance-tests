package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XswbymflohController {

    private final XswbymflohService xswbymflohService;

    public XswbymflohController(XswbymflohService xswbymflohService) {
        this.xswbymflohService = xswbymflohService;
    }

    @RequestMapping("/xswbymfloh")
    public String index() {
        return xswbymflohService.getGreeting();
    }

}

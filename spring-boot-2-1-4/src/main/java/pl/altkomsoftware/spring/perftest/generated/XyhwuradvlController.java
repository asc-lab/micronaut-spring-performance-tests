package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XyhwuradvlController {

    private final XyhwuradvlService xyhwuradvlService;

    public XyhwuradvlController(XyhwuradvlService xyhwuradvlService) {
        this.xyhwuradvlService = xyhwuradvlService;
    }

    @RequestMapping("/xyhwuradvl")
    public String index() {
        return xyhwuradvlService.getGreeting();
    }

}

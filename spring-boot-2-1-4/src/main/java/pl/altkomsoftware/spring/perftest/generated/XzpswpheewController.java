package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XzpswpheewController {

    private final XzpswpheewService xzpswpheewService;

    public XzpswpheewController(XzpswpheewService xzpswpheewService) {
        this.xzpswpheewService = xzpswpheewService;
    }

    @RequestMapping("/xzpswpheew")
    public String index() {
        return xzpswpheewService.getGreeting();
    }

}

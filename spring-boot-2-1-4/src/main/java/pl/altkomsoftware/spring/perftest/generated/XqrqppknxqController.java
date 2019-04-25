package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XqrqppknxqController {

    private final XqrqppknxqService xqrqppknxqService;

    public XqrqppknxqController(XqrqppknxqService xqrqppknxqService) {
        this.xqrqppknxqService = xqrqppknxqService;
    }

    @RequestMapping("/xqrqppknxq")
    public String index() {
        return xqrqppknxqService.getGreeting();
    }

}

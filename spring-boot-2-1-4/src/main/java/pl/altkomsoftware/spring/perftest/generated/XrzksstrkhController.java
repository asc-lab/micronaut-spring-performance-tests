package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XrzksstrkhController {

    private final XrzksstrkhService xrzksstrkhService;

    public XrzksstrkhController(XrzksstrkhService xrzksstrkhService) {
        this.xrzksstrkhService = xrzksstrkhService;
    }

    @RequestMapping("/xrzksstrkh")
    public String index() {
        return xrzksstrkhService.getGreeting();
    }

}

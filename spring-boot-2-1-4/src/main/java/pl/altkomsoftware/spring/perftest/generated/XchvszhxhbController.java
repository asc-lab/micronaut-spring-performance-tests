package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XchvszhxhbController {

    private final XchvszhxhbService xchvszhxhbService;

    public XchvszhxhbController(XchvszhxhbService xchvszhxhbService) {
        this.xchvszhxhbService = xchvszhxhbService;
    }

    @RequestMapping("/xchvszhxhb")
    public String index() {
        return xchvszhxhbService.getGreeting();
    }

}

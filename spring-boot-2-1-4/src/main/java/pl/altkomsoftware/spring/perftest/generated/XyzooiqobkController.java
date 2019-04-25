package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XyzooiqobkController {

    private final XyzooiqobkService xyzooiqobkService;

    public XyzooiqobkController(XyzooiqobkService xyzooiqobkService) {
        this.xyzooiqobkService = xyzooiqobkService;
    }

    @RequestMapping("/xyzooiqobk")
    public String index() {
        return xyzooiqobkService.getGreeting();
    }

}

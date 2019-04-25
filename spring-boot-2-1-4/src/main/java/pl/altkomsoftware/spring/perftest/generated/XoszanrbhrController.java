package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XoszanrbhrController {

    private final XoszanrbhrService xoszanrbhrService;

    public XoszanrbhrController(XoszanrbhrService xoszanrbhrService) {
        this.xoszanrbhrService = xoszanrbhrService;
    }

    @RequestMapping("/xoszanrbhr")
    public String index() {
        return xoszanrbhrService.getGreeting();
    }

}

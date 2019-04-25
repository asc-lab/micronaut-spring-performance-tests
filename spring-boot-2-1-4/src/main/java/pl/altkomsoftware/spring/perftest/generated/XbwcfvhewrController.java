package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XbwcfvhewrController {

    private final XbwcfvhewrService xbwcfvhewrService;

    public XbwcfvhewrController(XbwcfvhewrService xbwcfvhewrService) {
        this.xbwcfvhewrService = xbwcfvhewrService;
    }

    @RequestMapping("/xbwcfvhewr")
    public String index() {
        return xbwcfvhewrService.getGreeting();
    }

}

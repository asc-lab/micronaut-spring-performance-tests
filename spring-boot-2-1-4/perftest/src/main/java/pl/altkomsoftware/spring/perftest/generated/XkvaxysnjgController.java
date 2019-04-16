package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class XkvaxysnjgController {

    private final XkvaxysnjgService xkvaxysnjgService;

    public XkvaxysnjgController(XkvaxysnjgService xkvaxysnjgService) {
        this.xkvaxysnjgService = xkvaxysnjgService;
    }

    @RequestMapping("/xkvaxysnjg")
    public String index() {
        return xkvaxysnjgService.getGreeting();
    }

}

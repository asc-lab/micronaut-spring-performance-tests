package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KfflhujoqiController {

    private final KfflhujoqiService kfflhujoqiService;

    public KfflhujoqiController(KfflhujoqiService kfflhujoqiService) {
        this.kfflhujoqiService = kfflhujoqiService;
    }

    @RequestMapping("/kfflhujoqi")
    public String index() {
        return kfflhujoqiService.getGreeting();
    }

}

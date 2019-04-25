package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class InsmtqtitbController {

    private final InsmtqtitbService insmtqtitbService;

    public InsmtqtitbController(InsmtqtitbService insmtqtitbService) {
        this.insmtqtitbService = insmtqtitbService;
    }

    @RequestMapping("/insmtqtitb")
    public String index() {
        return insmtqtitbService.getGreeting();
    }

}

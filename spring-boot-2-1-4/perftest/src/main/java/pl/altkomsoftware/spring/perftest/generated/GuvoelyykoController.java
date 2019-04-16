package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GuvoelyykoController {

    private final GuvoelyykoService guvoelyykoService;

    public GuvoelyykoController(GuvoelyykoService guvoelyykoService) {
        this.guvoelyykoService = guvoelyykoService;
    }

    @RequestMapping("/guvoelyyko")
    public String index() {
        return guvoelyykoService.getGreeting();
    }

}

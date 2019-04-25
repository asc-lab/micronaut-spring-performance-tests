package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ActoclnbklController {

    private final ActoclnbklService actoclnbklService;

    public ActoclnbklController(ActoclnbklService actoclnbklService) {
        this.actoclnbklService = actoclnbklService;
    }

    @RequestMapping("/actoclnbkl")
    public String index() {
        return actoclnbklService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DoqykcuypqController {

    private final DoqykcuypqService doqykcuypqService;

    public DoqykcuypqController(DoqykcuypqService doqykcuypqService) {
        this.doqykcuypqService = doqykcuypqService;
    }

    @RequestMapping("/doqykcuypq")
    public String index() {
        return doqykcuypqService.getGreeting();
    }

}

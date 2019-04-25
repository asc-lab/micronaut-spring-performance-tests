package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WysfjdrzqpController {

    private final WysfjdrzqpService wysfjdrzqpService;

    public WysfjdrzqpController(WysfjdrzqpService wysfjdrzqpService) {
        this.wysfjdrzqpService = wysfjdrzqpService;
    }

    @RequestMapping("/wysfjdrzqp")
    public String index() {
        return wysfjdrzqpService.getGreeting();
    }

}

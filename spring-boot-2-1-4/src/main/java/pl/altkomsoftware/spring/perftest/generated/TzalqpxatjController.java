package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TzalqpxatjController {

    private final TzalqpxatjService tzalqpxatjService;

    public TzalqpxatjController(TzalqpxatjService tzalqpxatjService) {
        this.tzalqpxatjService = tzalqpxatjService;
    }

    @RequestMapping("/tzalqpxatj")
    public String index() {
        return tzalqpxatjService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BmoqpylzddController {

    private final BmoqpylzddService bmoqpylzddService;

    public BmoqpylzddController(BmoqpylzddService bmoqpylzddService) {
        this.bmoqpylzddService = bmoqpylzddService;
    }

    @RequestMapping("/bmoqpylzdd")
    public String index() {
        return bmoqpylzddService.getGreeting();
    }

}

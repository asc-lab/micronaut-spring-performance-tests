package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KaxvgslkbcController {

    private final KaxvgslkbcService kaxvgslkbcService;

    public KaxvgslkbcController(KaxvgslkbcService kaxvgslkbcService) {
        this.kaxvgslkbcService = kaxvgslkbcService;
    }

    @RequestMapping("/kaxvgslkbc")
    public String index() {
        return kaxvgslkbcService.getGreeting();
    }

}

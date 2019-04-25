package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TrzjmtsydrController {

    private final TrzjmtsydrService trzjmtsydrService;

    public TrzjmtsydrController(TrzjmtsydrService trzjmtsydrService) {
        this.trzjmtsydrService = trzjmtsydrService;
    }

    @RequestMapping("/trzjmtsydr")
    public String index() {
        return trzjmtsydrService.getGreeting();
    }

}

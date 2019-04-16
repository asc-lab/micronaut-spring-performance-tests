package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FxhzfaoyveController {

    private final FxhzfaoyveService fxhzfaoyveService;

    public FxhzfaoyveController(FxhzfaoyveService fxhzfaoyveService) {
        this.fxhzfaoyveService = fxhzfaoyveService;
    }

    @RequestMapping("/fxhzfaoyve")
    public String index() {
        return fxhzfaoyveService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PpvktsjjphController {

    private final PpvktsjjphService ppvktsjjphService;

    public PpvktsjjphController(PpvktsjjphService ppvktsjjphService) {
        this.ppvktsjjphService = ppvktsjjphService;
    }

    @RequestMapping("/ppvktsjjph")
    public String index() {
        return ppvktsjjphService.getGreeting();
    }

}

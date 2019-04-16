package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YrxurpkmobController {

    private final YrxurpkmobService yrxurpkmobService;

    public YrxurpkmobController(YrxurpkmobService yrxurpkmobService) {
        this.yrxurpkmobService = yrxurpkmobService;
    }

    @RequestMapping("/yrxurpkmob")
    public String index() {
        return yrxurpkmobService.getGreeting();
    }

}

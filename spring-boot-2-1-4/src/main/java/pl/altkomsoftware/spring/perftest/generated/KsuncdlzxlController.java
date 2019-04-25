package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KsuncdlzxlController {

    private final KsuncdlzxlService ksuncdlzxlService;

    public KsuncdlzxlController(KsuncdlzxlService ksuncdlzxlService) {
        this.ksuncdlzxlService = ksuncdlzxlService;
    }

    @RequestMapping("/ksuncdlzxl")
    public String index() {
        return ksuncdlzxlService.getGreeting();
    }

}

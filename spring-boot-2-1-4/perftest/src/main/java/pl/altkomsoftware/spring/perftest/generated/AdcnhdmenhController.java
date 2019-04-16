package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AdcnhdmenhController {

    private final AdcnhdmenhService adcnhdmenhService;

    public AdcnhdmenhController(AdcnhdmenhService adcnhdmenhService) {
        this.adcnhdmenhService = adcnhdmenhService;
    }

    @RequestMapping("/adcnhdmenh")
    public String index() {
        return adcnhdmenhService.getGreeting();
    }

}

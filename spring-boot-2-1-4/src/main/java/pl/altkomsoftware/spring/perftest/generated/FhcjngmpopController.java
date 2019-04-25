package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FhcjngmpopController {

    private final FhcjngmpopService fhcjngmpopService;

    public FhcjngmpopController(FhcjngmpopService fhcjngmpopService) {
        this.fhcjngmpopService = fhcjngmpopService;
    }

    @RequestMapping("/fhcjngmpop")
    public String index() {
        return fhcjngmpopService.getGreeting();
    }

}

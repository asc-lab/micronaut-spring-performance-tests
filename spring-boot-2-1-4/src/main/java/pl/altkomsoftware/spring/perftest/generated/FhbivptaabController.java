package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FhbivptaabController {

    private final FhbivptaabService fhbivptaabService;

    public FhbivptaabController(FhbivptaabService fhbivptaabService) {
        this.fhbivptaabService = fhbivptaabService;
    }

    @RequestMapping("/fhbivptaab")
    public String index() {
        return fhbivptaabService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FhkxzqjpcrController {

    private final FhkxzqjpcrService fhkxzqjpcrService;

    public FhkxzqjpcrController(FhkxzqjpcrService fhkxzqjpcrService) {
        this.fhkxzqjpcrService = fhkxzqjpcrService;
    }

    @RequestMapping("/fhkxzqjpcr")
    public String index() {
        return fhkxzqjpcrService.getGreeting();
    }

}

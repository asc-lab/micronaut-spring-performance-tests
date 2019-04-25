package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EgegarzmtlController {

    private final EgegarzmtlService egegarzmtlService;

    public EgegarzmtlController(EgegarzmtlService egegarzmtlService) {
        this.egegarzmtlService = egegarzmtlService;
    }

    @RequestMapping("/egegarzmtl")
    public String index() {
        return egegarzmtlService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NhxpalruhtController {

    private final NhxpalruhtService nhxpalruhtService;

    public NhxpalruhtController(NhxpalruhtService nhxpalruhtService) {
        this.nhxpalruhtService = nhxpalruhtService;
    }

    @RequestMapping("/nhxpalruht")
    public String index() {
        return nhxpalruhtService.getGreeting();
    }

}

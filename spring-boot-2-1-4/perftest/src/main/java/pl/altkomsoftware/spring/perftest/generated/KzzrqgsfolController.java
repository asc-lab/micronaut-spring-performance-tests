package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KzzrqgsfolController {

    private final KzzrqgsfolService kzzrqgsfolService;

    public KzzrqgsfolController(KzzrqgsfolService kzzrqgsfolService) {
        this.kzzrqgsfolService = kzzrqgsfolService;
    }

    @RequestMapping("/kzzrqgsfol")
    public String index() {
        return kzzrqgsfolService.getGreeting();
    }

}

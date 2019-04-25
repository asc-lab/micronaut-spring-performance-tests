package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NlkqmzhkwdController {

    private final NlkqmzhkwdService nlkqmzhkwdService;

    public NlkqmzhkwdController(NlkqmzhkwdService nlkqmzhkwdService) {
        this.nlkqmzhkwdService = nlkqmzhkwdService;
    }

    @RequestMapping("/nlkqmzhkwd")
    public String index() {
        return nlkqmzhkwdService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HmhanrrvtgController {

    private final HmhanrrvtgService hmhanrrvtgService;

    public HmhanrrvtgController(HmhanrrvtgService hmhanrrvtgService) {
        this.hmhanrrvtgService = hmhanrrvtgService;
    }

    @RequestMapping("/hmhanrrvtg")
    public String index() {
        return hmhanrrvtgService.getGreeting();
    }

}

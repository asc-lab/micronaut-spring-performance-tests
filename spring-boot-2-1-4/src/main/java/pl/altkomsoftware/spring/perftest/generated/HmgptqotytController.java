package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HmgptqotytController {

    private final HmgptqotytService hmgptqotytService;

    public HmgptqotytController(HmgptqotytService hmgptqotytService) {
        this.hmgptqotytService = hmgptqotytService;
    }

    @RequestMapping("/hmgptqotyt")
    public String index() {
        return hmgptqotytService.getGreeting();
    }

}

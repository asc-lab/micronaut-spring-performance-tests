package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LhvbqvlpfoController {

    private final LhvbqvlpfoService lhvbqvlpfoService;

    public LhvbqvlpfoController(LhvbqvlpfoService lhvbqvlpfoService) {
        this.lhvbqvlpfoService = lhvbqvlpfoService;
    }

    @RequestMapping("/lhvbqvlpfo")
    public String index() {
        return lhvbqvlpfoService.getGreeting();
    }

}

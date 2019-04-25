package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LfjgnjqubdController {

    private final LfjgnjqubdService lfjgnjqubdService;

    public LfjgnjqubdController(LfjgnjqubdService lfjgnjqubdService) {
        this.lfjgnjqubdService = lfjgnjqubdService;
    }

    @RequestMapping("/lfjgnjqubd")
    public String index() {
        return lfjgnjqubdService.getGreeting();
    }

}

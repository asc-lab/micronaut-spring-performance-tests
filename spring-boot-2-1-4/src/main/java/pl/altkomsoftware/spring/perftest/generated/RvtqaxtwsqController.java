package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RvtqaxtwsqController {

    private final RvtqaxtwsqService rvtqaxtwsqService;

    public RvtqaxtwsqController(RvtqaxtwsqService rvtqaxtwsqService) {
        this.rvtqaxtwsqService = rvtqaxtwsqService;
    }

    @RequestMapping("/rvtqaxtwsq")
    public String index() {
        return rvtqaxtwsqService.getGreeting();
    }

}

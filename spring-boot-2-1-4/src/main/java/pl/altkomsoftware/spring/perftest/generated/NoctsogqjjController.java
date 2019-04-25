package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NoctsogqjjController {

    private final NoctsogqjjService noctsogqjjService;

    public NoctsogqjjController(NoctsogqjjService noctsogqjjService) {
        this.noctsogqjjService = noctsogqjjService;
    }

    @RequestMapping("/noctsogqjj")
    public String index() {
        return noctsogqjjService.getGreeting();
    }

}

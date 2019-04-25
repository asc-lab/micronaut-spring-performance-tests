package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PrgnacmcizController {

    private final PrgnacmcizService prgnacmcizService;

    public PrgnacmcizController(PrgnacmcizService prgnacmcizService) {
        this.prgnacmcizService = prgnacmcizService;
    }

    @RequestMapping("/prgnacmciz")
    public String index() {
        return prgnacmcizService.getGreeting();
    }

}

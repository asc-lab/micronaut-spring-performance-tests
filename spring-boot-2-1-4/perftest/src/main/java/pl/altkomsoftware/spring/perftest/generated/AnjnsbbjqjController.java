package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AnjnsbbjqjController {

    private final AnjnsbbjqjService anjnsbbjqjService;

    public AnjnsbbjqjController(AnjnsbbjqjService anjnsbbjqjService) {
        this.anjnsbbjqjService = anjnsbbjqjService;
    }

    @RequestMapping("/anjnsbbjqj")
    public String index() {
        return anjnsbbjqjService.getGreeting();
    }

}

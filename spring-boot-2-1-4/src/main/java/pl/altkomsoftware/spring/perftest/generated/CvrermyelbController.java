package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CvrermyelbController {

    private final CvrermyelbService cvrermyelbService;

    public CvrermyelbController(CvrermyelbService cvrermyelbService) {
        this.cvrermyelbService = cvrermyelbService;
    }

    @RequestMapping("/cvrermyelb")
    public String index() {
        return cvrermyelbService.getGreeting();
    }

}

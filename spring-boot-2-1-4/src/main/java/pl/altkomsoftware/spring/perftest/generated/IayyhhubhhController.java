package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IayyhhubhhController {

    private final IayyhhubhhService iayyhhubhhService;

    public IayyhhubhhController(IayyhhubhhService iayyhhubhhService) {
        this.iayyhhubhhService = iayyhhubhhService;
    }

    @RequestMapping("/iayyhhubhh")
    public String index() {
        return iayyhhubhhService.getGreeting();
    }

}

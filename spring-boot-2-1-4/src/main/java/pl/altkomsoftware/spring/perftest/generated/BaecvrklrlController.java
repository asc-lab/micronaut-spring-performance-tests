package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BaecvrklrlController {

    private final BaecvrklrlService baecvrklrlService;

    public BaecvrklrlController(BaecvrklrlService baecvrklrlService) {
        this.baecvrklrlService = baecvrklrlService;
    }

    @RequestMapping("/baecvrklrl")
    public String index() {
        return baecvrklrlService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UkpmlajptzController {

    private final UkpmlajptzService ukpmlajptzService;

    public UkpmlajptzController(UkpmlajptzService ukpmlajptzService) {
        this.ukpmlajptzService = ukpmlajptzService;
    }

    @RequestMapping("/ukpmlajptz")
    public String index() {
        return ukpmlajptzService.getGreeting();
    }

}

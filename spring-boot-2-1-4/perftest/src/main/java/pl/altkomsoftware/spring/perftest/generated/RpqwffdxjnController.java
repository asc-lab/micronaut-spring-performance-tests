package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RpqwffdxjnController {

    private final RpqwffdxjnService rpqwffdxjnService;

    public RpqwffdxjnController(RpqwffdxjnService rpqwffdxjnService) {
        this.rpqwffdxjnService = rpqwffdxjnService;
    }

    @RequestMapping("/rpqwffdxjn")
    public String index() {
        return rpqwffdxjnService.getGreeting();
    }

}

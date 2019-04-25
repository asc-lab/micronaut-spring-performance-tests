package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SzwsjruqncController {

    private final SzwsjruqncService szwsjruqncService;

    public SzwsjruqncController(SzwsjruqncService szwsjruqncService) {
        this.szwsjruqncService = szwsjruqncService;
    }

    @RequestMapping("/szwsjruqnc")
    public String index() {
        return szwsjruqncService.getGreeting();
    }

}

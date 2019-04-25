package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LsvmlmqatwController {

    private final LsvmlmqatwService lsvmlmqatwService;

    public LsvmlmqatwController(LsvmlmqatwService lsvmlmqatwService) {
        this.lsvmlmqatwService = lsvmlmqatwService;
    }

    @RequestMapping("/lsvmlmqatw")
    public String index() {
        return lsvmlmqatwService.getGreeting();
    }

}

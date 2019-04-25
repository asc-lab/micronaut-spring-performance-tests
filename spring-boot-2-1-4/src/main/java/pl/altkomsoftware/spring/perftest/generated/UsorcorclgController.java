package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UsorcorclgController {

    private final UsorcorclgService usorcorclgService;

    public UsorcorclgController(UsorcorclgService usorcorclgService) {
        this.usorcorclgService = usorcorclgService;
    }

    @RequestMapping("/usorcorclg")
    public String index() {
        return usorcorclgService.getGreeting();
    }

}

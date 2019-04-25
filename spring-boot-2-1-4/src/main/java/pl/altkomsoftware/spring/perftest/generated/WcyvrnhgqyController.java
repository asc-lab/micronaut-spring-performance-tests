package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WcyvrnhgqyController {

    private final WcyvrnhgqyService wcyvrnhgqyService;

    public WcyvrnhgqyController(WcyvrnhgqyService wcyvrnhgqyService) {
        this.wcyvrnhgqyService = wcyvrnhgqyService;
    }

    @RequestMapping("/wcyvrnhgqy")
    public String index() {
        return wcyvrnhgqyService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YgpqjzwzioController {

    private final YgpqjzwzioService ygpqjzwzioService;

    public YgpqjzwzioController(YgpqjzwzioService ygpqjzwzioService) {
        this.ygpqjzwzioService = ygpqjzwzioService;
    }

    @RequestMapping("/ygpqjzwzio")
    public String index() {
        return ygpqjzwzioService.getGreeting();
    }

}

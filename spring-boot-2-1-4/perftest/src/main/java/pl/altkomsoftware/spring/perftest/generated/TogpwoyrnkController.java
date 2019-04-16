package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TogpwoyrnkController {

    private final TogpwoyrnkService togpwoyrnkService;

    public TogpwoyrnkController(TogpwoyrnkService togpwoyrnkService) {
        this.togpwoyrnkService = togpwoyrnkService;
    }

    @RequestMapping("/togpwoyrnk")
    public String index() {
        return togpwoyrnkService.getGreeting();
    }

}

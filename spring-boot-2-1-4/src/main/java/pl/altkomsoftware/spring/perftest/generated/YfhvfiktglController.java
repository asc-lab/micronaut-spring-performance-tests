package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YfhvfiktglController {

    private final YfhvfiktglService yfhvfiktglService;

    public YfhvfiktglController(YfhvfiktglService yfhvfiktglService) {
        this.yfhvfiktglService = yfhvfiktglService;
    }

    @RequestMapping("/yfhvfiktgl")
    public String index() {
        return yfhvfiktglService.getGreeting();
    }

}

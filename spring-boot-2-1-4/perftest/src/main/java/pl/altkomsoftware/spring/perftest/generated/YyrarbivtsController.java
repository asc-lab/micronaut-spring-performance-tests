package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YyrarbivtsController {

    private final YyrarbivtsService yyrarbivtsService;

    public YyrarbivtsController(YyrarbivtsService yyrarbivtsService) {
        this.yyrarbivtsService = yyrarbivtsService;
    }

    @RequestMapping("/yyrarbivts")
    public String index() {
        return yyrarbivtsService.getGreeting();
    }

}

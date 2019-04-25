package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YsgbrnkhqyController {

    private final YsgbrnkhqyService ysgbrnkhqyService;

    public YsgbrnkhqyController(YsgbrnkhqyService ysgbrnkhqyService) {
        this.ysgbrnkhqyService = ysgbrnkhqyService;
    }

    @RequestMapping("/ysgbrnkhqy")
    public String index() {
        return ysgbrnkhqyService.getGreeting();
    }

}

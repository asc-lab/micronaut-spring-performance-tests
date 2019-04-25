package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YrkqxaglfeController {

    private final YrkqxaglfeService yrkqxaglfeService;

    public YrkqxaglfeController(YrkqxaglfeService yrkqxaglfeService) {
        this.yrkqxaglfeService = yrkqxaglfeService;
    }

    @RequestMapping("/yrkqxaglfe")
    public String index() {
        return yrkqxaglfeService.getGreeting();
    }

}

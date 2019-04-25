package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YqpsyswfwzController {

    private final YqpsyswfwzService yqpsyswfwzService;

    public YqpsyswfwzController(YqpsyswfwzService yqpsyswfwzService) {
        this.yqpsyswfwzService = yqpsyswfwzService;
    }

    @RequestMapping("/yqpsyswfwz")
    public String index() {
        return yqpsyswfwzService.getGreeting();
    }

}

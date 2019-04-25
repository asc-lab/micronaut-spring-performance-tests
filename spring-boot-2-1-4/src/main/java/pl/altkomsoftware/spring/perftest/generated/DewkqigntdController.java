package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DewkqigntdController {

    private final DewkqigntdService dewkqigntdService;

    public DewkqigntdController(DewkqigntdService dewkqigntdService) {
        this.dewkqigntdService = dewkqigntdService;
    }

    @RequestMapping("/dewkqigntd")
    public String index() {
        return dewkqigntdService.getGreeting();
    }

}

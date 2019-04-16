package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class QtxjwxaahcController {

    private final QtxjwxaahcService qtxjwxaahcService;

    public QtxjwxaahcController(QtxjwxaahcService qtxjwxaahcService) {
        this.qtxjwxaahcService = qtxjwxaahcService;
    }

    @RequestMapping("/qtxjwxaahc")
    public String index() {
        return qtxjwxaahcService.getGreeting();
    }

}

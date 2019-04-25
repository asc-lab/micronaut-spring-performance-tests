package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WlwqticwjkController {

    private final WlwqticwjkService wlwqticwjkService;

    public WlwqticwjkController(WlwqticwjkService wlwqticwjkService) {
        this.wlwqticwjkService = wlwqticwjkService;
    }

    @RequestMapping("/wlwqticwjk")
    public String index() {
        return wlwqticwjkService.getGreeting();
    }

}

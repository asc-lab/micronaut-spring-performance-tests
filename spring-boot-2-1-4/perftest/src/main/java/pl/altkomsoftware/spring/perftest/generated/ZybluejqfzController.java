package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZybluejqfzController {

    private final ZybluejqfzService zybluejqfzService;

    public ZybluejqfzController(ZybluejqfzService zybluejqfzService) {
        this.zybluejqfzService = zybluejqfzService;
    }

    @RequestMapping("/zybluejqfz")
    public String index() {
        return zybluejqfzService.getGreeting();
    }

}

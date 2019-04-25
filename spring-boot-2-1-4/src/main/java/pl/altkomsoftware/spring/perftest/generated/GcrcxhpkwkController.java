package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GcrcxhpkwkController {

    private final GcrcxhpkwkService gcrcxhpkwkService;

    public GcrcxhpkwkController(GcrcxhpkwkService gcrcxhpkwkService) {
        this.gcrcxhpkwkService = gcrcxhpkwkService;
    }

    @RequestMapping("/gcrcxhpkwk")
    public String index() {
        return gcrcxhpkwkService.getGreeting();
    }

}

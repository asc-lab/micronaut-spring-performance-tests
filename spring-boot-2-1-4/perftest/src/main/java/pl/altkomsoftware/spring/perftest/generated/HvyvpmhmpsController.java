package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HvyvpmhmpsController {

    private final HvyvpmhmpsService hvyvpmhmpsService;

    public HvyvpmhmpsController(HvyvpmhmpsService hvyvpmhmpsService) {
        this.hvyvpmhmpsService = hvyvpmhmpsService;
    }

    @RequestMapping("/hvyvpmhmps")
    public String index() {
        return hvyvpmhmpsService.getGreeting();
    }

}

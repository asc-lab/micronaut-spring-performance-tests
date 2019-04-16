package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class UpsfugydzpController {

    private final UpsfugydzpService upsfugydzpService;

    public UpsfugydzpController(UpsfugydzpService upsfugydzpService) {
        this.upsfugydzpService = upsfugydzpService;
    }

    @RequestMapping("/upsfugydzp")
    public String index() {
        return upsfugydzpService.getGreeting();
    }

}

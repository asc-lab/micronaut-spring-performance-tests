package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DuekwwmntxController {

    private final DuekwwmntxService duekwwmntxService;

    public DuekwwmntxController(DuekwwmntxService duekwwmntxService) {
        this.duekwwmntxService = duekwwmntxService;
    }

    @RequestMapping("/duekwwmntx")
    public String index() {
        return duekwwmntxService.getGreeting();
    }

}

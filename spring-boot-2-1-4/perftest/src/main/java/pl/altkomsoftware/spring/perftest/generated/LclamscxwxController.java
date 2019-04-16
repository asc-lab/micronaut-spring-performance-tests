package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LclamscxwxController {

    private final LclamscxwxService lclamscxwxService;

    public LclamscxwxController(LclamscxwxService lclamscxwxService) {
        this.lclamscxwxService = lclamscxwxService;
    }

    @RequestMapping("/lclamscxwx")
    public String index() {
        return lclamscxwxService.getGreeting();
    }

}

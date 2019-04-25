package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YnrqnuygbdController {

    private final YnrqnuygbdService ynrqnuygbdService;

    public YnrqnuygbdController(YnrqnuygbdService ynrqnuygbdService) {
        this.ynrqnuygbdService = ynrqnuygbdService;
    }

    @RequestMapping("/ynrqnuygbd")
    public String index() {
        return ynrqnuygbdService.getGreeting();
    }

}

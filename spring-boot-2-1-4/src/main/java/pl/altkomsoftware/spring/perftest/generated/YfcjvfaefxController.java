package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YfcjvfaefxController {

    private final YfcjvfaefxService yfcjvfaefxService;

    public YfcjvfaefxController(YfcjvfaefxService yfcjvfaefxService) {
        this.yfcjvfaefxService = yfcjvfaefxService;
    }

    @RequestMapping("/yfcjvfaefx")
    public String index() {
        return yfcjvfaefxService.getGreeting();
    }

}

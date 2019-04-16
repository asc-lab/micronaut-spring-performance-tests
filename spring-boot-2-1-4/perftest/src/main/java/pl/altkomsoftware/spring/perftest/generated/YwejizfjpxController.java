package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YwejizfjpxController {

    private final YwejizfjpxService ywejizfjpxService;

    public YwejizfjpxController(YwejizfjpxService ywejizfjpxService) {
        this.ywejizfjpxService = ywejizfjpxService;
    }

    @RequestMapping("/ywejizfjpx")
    public String index() {
        return ywejizfjpxService.getGreeting();
    }

}

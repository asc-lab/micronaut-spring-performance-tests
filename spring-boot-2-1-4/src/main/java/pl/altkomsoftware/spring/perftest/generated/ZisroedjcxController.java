package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZisroedjcxController {

    private final ZisroedjcxService zisroedjcxService;

    public ZisroedjcxController(ZisroedjcxService zisroedjcxService) {
        this.zisroedjcxService = zisroedjcxService;
    }

    @RequestMapping("/zisroedjcx")
    public String index() {
        return zisroedjcxService.getGreeting();
    }

}

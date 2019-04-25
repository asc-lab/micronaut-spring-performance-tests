package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZcrsitwinzController {

    private final ZcrsitwinzService zcrsitwinzService;

    public ZcrsitwinzController(ZcrsitwinzService zcrsitwinzService) {
        this.zcrsitwinzService = zcrsitwinzService;
    }

    @RequestMapping("/zcrsitwinz")
    public String index() {
        return zcrsitwinzService.getGreeting();
    }

}

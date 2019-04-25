package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZegitelofwController {

    private final ZegitelofwService zegitelofwService;

    public ZegitelofwController(ZegitelofwService zegitelofwService) {
        this.zegitelofwService = zegitelofwService;
    }

    @RequestMapping("/zegitelofw")
    public String index() {
        return zegitelofwService.getGreeting();
    }

}

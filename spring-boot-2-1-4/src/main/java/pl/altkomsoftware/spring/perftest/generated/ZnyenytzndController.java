package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZnyenytzndController {

    private final ZnyenytzndService znyenytzndService;

    public ZnyenytzndController(ZnyenytzndService znyenytzndService) {
        this.znyenytzndService = znyenytzndService;
    }

    @RequestMapping("/znyenytznd")
    public String index() {
        return znyenytzndService.getGreeting();
    }

}

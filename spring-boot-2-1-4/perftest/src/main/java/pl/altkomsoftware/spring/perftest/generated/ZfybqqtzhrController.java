package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZfybqqtzhrController {

    private final ZfybqqtzhrService zfybqqtzhrService;

    public ZfybqqtzhrController(ZfybqqtzhrService zfybqqtzhrService) {
        this.zfybqqtzhrService = zfybqqtzhrService;
    }

    @RequestMapping("/zfybqqtzhr")
    public String index() {
        return zfybqqtzhrService.getGreeting();
    }

}

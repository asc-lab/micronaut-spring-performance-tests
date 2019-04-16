package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JawqnhayjpController {

    private final JawqnhayjpService jawqnhayjpService;

    public JawqnhayjpController(JawqnhayjpService jawqnhayjpService) {
        this.jawqnhayjpService = jawqnhayjpService;
    }

    @RequestMapping("/jawqnhayjp")
    public String index() {
        return jawqnhayjpService.getGreeting();
    }

}

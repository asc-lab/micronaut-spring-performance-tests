package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JawbkxptnpController {

    private final JawbkxptnpService jawbkxptnpService;

    public JawbkxptnpController(JawbkxptnpService jawbkxptnpService) {
        this.jawbkxptnpService = jawbkxptnpService;
    }

    @RequestMapping("/jawbkxptnp")
    public String index() {
        return jawbkxptnpService.getGreeting();
    }

}

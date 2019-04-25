package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class JetuxdpkjiController {

    private final JetuxdpkjiService jetuxdpkjiService;

    public JetuxdpkjiController(JetuxdpkjiService jetuxdpkjiService) {
        this.jetuxdpkjiService = jetuxdpkjiService;
    }

    @RequestMapping("/jetuxdpkji")
    public String index() {
        return jetuxdpkjiService.getGreeting();
    }

}

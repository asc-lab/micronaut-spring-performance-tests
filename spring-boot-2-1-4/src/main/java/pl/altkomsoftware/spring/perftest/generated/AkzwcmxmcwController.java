package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AkzwcmxmcwController {

    private final AkzwcmxmcwService akzwcmxmcwService;

    public AkzwcmxmcwController(AkzwcmxmcwService akzwcmxmcwService) {
        this.akzwcmxmcwService = akzwcmxmcwService;
    }

    @RequestMapping("/akzwcmxmcw")
    public String index() {
        return akzwcmxmcwService.getGreeting();
    }

}

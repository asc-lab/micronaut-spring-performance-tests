package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZijwpeayzmController {

    private final ZijwpeayzmService zijwpeayzmService;

    public ZijwpeayzmController(ZijwpeayzmService zijwpeayzmService) {
        this.zijwpeayzmService = zijwpeayzmService;
    }

    @RequestMapping("/zijwpeayzm")
    public String index() {
        return zijwpeayzmService.getGreeting();
    }

}

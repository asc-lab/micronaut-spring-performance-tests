package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZucffkwhocController {

    private final ZucffkwhocService zucffkwhocService;

    public ZucffkwhocController(ZucffkwhocService zucffkwhocService) {
        this.zucffkwhocService = zucffkwhocService;
    }

    @RequestMapping("/zucffkwhoc")
    public String index() {
        return zucffkwhocService.getGreeting();
    }

}

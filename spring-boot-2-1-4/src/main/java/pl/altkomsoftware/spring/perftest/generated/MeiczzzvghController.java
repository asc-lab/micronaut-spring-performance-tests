package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MeiczzzvghController {

    private final MeiczzzvghService meiczzzvghService;

    public MeiczzzvghController(MeiczzzvghService meiczzzvghService) {
        this.meiczzzvghService = meiczzzvghService;
    }

    @RequestMapping("/meiczzzvgh")
    public String index() {
        return meiczzzvghService.getGreeting();
    }

}

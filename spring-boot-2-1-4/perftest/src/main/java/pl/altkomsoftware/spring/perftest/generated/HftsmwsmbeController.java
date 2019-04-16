package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HftsmwsmbeController {

    private final HftsmwsmbeService hftsmwsmbeService;

    public HftsmwsmbeController(HftsmwsmbeService hftsmwsmbeService) {
        this.hftsmwsmbeService = hftsmwsmbeService;
    }

    @RequestMapping("/hftsmwsmbe")
    public String index() {
        return hftsmwsmbeService.getGreeting();
    }

}

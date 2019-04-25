package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MadxntgccdController {

    private final MadxntgccdService madxntgccdService;

    public MadxntgccdController(MadxntgccdService madxntgccdService) {
        this.madxntgccdService = madxntgccdService;
    }

    @RequestMapping("/madxntgccd")
    public String index() {
        return madxntgccdService.getGreeting();
    }

}

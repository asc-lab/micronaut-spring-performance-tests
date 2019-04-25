package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HzrahhwzcyController {

    private final HzrahhwzcyService hzrahhwzcyService;

    public HzrahhwzcyController(HzrahhwzcyService hzrahhwzcyService) {
        this.hzrahhwzcyService = hzrahhwzcyService;
    }

    @RequestMapping("/hzrahhwzcy")
    public String index() {
        return hzrahhwzcyService.getGreeting();
    }

}

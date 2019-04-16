package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MgdmvqjwmzController {

    private final MgdmvqjwmzService mgdmvqjwmzService;

    public MgdmvqjwmzController(MgdmvqjwmzService mgdmvqjwmzService) {
        this.mgdmvqjwmzService = mgdmvqjwmzService;
    }

    @RequestMapping("/mgdmvqjwmz")
    public String index() {
        return mgdmvqjwmzService.getGreeting();
    }

}

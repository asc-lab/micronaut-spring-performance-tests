package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OvpmhmckitController {

    private final OvpmhmckitService ovpmhmckitService;

    public OvpmhmckitController(OvpmhmckitService ovpmhmckitService) {
        this.ovpmhmckitService = ovpmhmckitService;
    }

    @RequestMapping("/ovpmhmckit")
    public String index() {
        return ovpmhmckitService.getGreeting();
    }

}

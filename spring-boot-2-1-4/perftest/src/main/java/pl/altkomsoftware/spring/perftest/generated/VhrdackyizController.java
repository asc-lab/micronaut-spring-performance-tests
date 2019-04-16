package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VhrdackyizController {

    private final VhrdackyizService vhrdackyizService;

    public VhrdackyizController(VhrdackyizService vhrdackyizService) {
        this.vhrdackyizService = vhrdackyizService;
    }

    @RequestMapping("/vhrdackyiz")
    public String index() {
        return vhrdackyizService.getGreeting();
    }

}

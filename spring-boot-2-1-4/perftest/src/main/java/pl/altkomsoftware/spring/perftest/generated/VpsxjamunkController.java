package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VpsxjamunkController {

    private final VpsxjamunkService vpsxjamunkService;

    public VpsxjamunkController(VpsxjamunkService vpsxjamunkService) {
        this.vpsxjamunkService = vpsxjamunkService;
    }

    @RequestMapping("/vpsxjamunk")
    public String index() {
        return vpsxjamunkService.getGreeting();
    }

}

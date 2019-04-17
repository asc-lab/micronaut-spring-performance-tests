package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VdefmufholController {

    private final VdefmufholService vdefmufholService;

    public VdefmufholController(VdefmufholService vdefmufholService) {
        this.vdefmufholService = vdefmufholService;
    }

    @RequestMapping("/vdefmufhol")
    public String index() {
        return vdefmufholService.getGreeting();
    }

}
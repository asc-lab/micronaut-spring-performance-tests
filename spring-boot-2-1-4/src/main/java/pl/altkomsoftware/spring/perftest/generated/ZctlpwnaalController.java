package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ZctlpwnaalController {

    private final ZctlpwnaalService zctlpwnaalService;

    public ZctlpwnaalController(ZctlpwnaalService zctlpwnaalService) {
        this.zctlpwnaalService = zctlpwnaalService;
    }

    @RequestMapping("/zctlpwnaal")
    public String index() {
        return zctlpwnaalService.getGreeting();
    }

}

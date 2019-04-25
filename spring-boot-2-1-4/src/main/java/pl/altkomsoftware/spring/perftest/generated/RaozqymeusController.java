package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RaozqymeusController {

    private final RaozqymeusService raozqymeusService;

    public RaozqymeusController(RaozqymeusService raozqymeusService) {
        this.raozqymeusService = raozqymeusService;
    }

    @RequestMapping("/raozqymeus")
    public String index() {
        return raozqymeusService.getGreeting();
    }

}

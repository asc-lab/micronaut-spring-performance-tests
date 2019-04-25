package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ShapmuceimController {

    private final ShapmuceimService shapmuceimService;

    public ShapmuceimController(ShapmuceimService shapmuceimService) {
        this.shapmuceimService = shapmuceimService;
    }

    @RequestMapping("/shapmuceim")
    public String index() {
        return shapmuceimService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RddyzdclnpController {

    private final RddyzdclnpService rddyzdclnpService;

    public RddyzdclnpController(RddyzdclnpService rddyzdclnpService) {
        this.rddyzdclnpService = rddyzdclnpService;
    }

    @RequestMapping("/rddyzdclnp")
    public String index() {
        return rddyzdclnpService.getGreeting();
    }

}

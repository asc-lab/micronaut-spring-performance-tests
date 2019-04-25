package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GefkxsybqpController {

    private final GefkxsybqpService gefkxsybqpService;

    public GefkxsybqpController(GefkxsybqpService gefkxsybqpService) {
        this.gefkxsybqpService = gefkxsybqpService;
    }

    @RequestMapping("/gefkxsybqp")
    public String index() {
        return gefkxsybqpService.getGreeting();
    }

}

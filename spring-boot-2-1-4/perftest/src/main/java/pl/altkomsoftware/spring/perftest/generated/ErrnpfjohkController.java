package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ErrnpfjohkController {

    private final ErrnpfjohkService errnpfjohkService;

    public ErrnpfjohkController(ErrnpfjohkService errnpfjohkService) {
        this.errnpfjohkService = errnpfjohkService;
    }

    @RequestMapping("/errnpfjohk")
    public String index() {
        return errnpfjohkService.getGreeting();
    }

}

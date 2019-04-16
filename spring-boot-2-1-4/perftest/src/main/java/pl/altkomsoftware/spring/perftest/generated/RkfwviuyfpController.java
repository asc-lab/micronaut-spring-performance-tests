package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RkfwviuyfpController {

    private final RkfwviuyfpService rkfwviuyfpService;

    public RkfwviuyfpController(RkfwviuyfpService rkfwviuyfpService) {
        this.rkfwviuyfpService = rkfwviuyfpService;
    }

    @RequestMapping("/rkfwviuyfp")
    public String index() {
        return rkfwviuyfpService.getGreeting();
    }

}

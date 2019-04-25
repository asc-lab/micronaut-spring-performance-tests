package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HwwhwhlkncController {

    private final HwwhwhlkncService hwwhwhlkncService;

    public HwwhwhlkncController(HwwhwhlkncService hwwhwhlkncService) {
        this.hwwhwhlkncService = hwwhwhlkncService;
    }

    @RequestMapping("/hwwhwhlknc")
    public String index() {
        return hwwhwhlkncService.getGreeting();
    }

}

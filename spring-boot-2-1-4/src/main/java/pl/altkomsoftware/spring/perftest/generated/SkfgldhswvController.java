package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SkfgldhswvController {

    private final SkfgldhswvService skfgldhswvService;

    public SkfgldhswvController(SkfgldhswvService skfgldhswvService) {
        this.skfgldhswvService = skfgldhswvService;
    }

    @RequestMapping("/skfgldhswv")
    public String index() {
        return skfgldhswvService.getGreeting();
    }

}

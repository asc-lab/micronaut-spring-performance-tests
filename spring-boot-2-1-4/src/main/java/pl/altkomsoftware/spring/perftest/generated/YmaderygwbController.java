package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YmaderygwbController {

    private final YmaderygwbService ymaderygwbService;

    public YmaderygwbController(YmaderygwbService ymaderygwbService) {
        this.ymaderygwbService = ymaderygwbService;
    }

    @RequestMapping("/ymaderygwb")
    public String index() {
        return ymaderygwbService.getGreeting();
    }

}

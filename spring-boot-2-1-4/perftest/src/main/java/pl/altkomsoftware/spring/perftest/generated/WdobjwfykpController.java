package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WdobjwfykpController {

    private final WdobjwfykpService wdobjwfykpService;

    public WdobjwfykpController(WdobjwfykpService wdobjwfykpService) {
        this.wdobjwfykpService = wdobjwfykpService;
    }

    @RequestMapping("/wdobjwfykp")
    public String index() {
        return wdobjwfykpService.getGreeting();
    }

}

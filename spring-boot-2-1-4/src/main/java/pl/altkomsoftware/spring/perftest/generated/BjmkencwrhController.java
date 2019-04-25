package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BjmkencwrhController {

    private final BjmkencwrhService bjmkencwrhService;

    public BjmkencwrhController(BjmkencwrhService bjmkencwrhService) {
        this.bjmkencwrhService = bjmkencwrhService;
    }

    @RequestMapping("/bjmkencwrh")
    public String index() {
        return bjmkencwrhService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class YpbqbbhnhpController {

    private final YpbqbbhnhpService ypbqbbhnhpService;

    public YpbqbbhnhpController(YpbqbbhnhpService ypbqbbhnhpService) {
        this.ypbqbbhnhpService = ypbqbbhnhpService;
    }

    @RequestMapping("/ypbqbbhnhp")
    public String index() {
        return ypbqbbhnhpService.getGreeting();
    }

}

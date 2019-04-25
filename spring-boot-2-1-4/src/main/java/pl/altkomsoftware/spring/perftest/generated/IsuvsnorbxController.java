package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class IsuvsnorbxController {

    private final IsuvsnorbxService isuvsnorbxService;

    public IsuvsnorbxController(IsuvsnorbxService isuvsnorbxService) {
        this.isuvsnorbxService = isuvsnorbxService;
    }

    @RequestMapping("/isuvsnorbx")
    public String index() {
        return isuvsnorbxService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RxirfwjakpController {

    private final RxirfwjakpService rxirfwjakpService;

    public RxirfwjakpController(RxirfwjakpService rxirfwjakpService) {
        this.rxirfwjakpService = rxirfwjakpService;
    }

    @RequestMapping("/rxirfwjakp")
    public String index() {
        return rxirfwjakpService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NagjbrkcjxController {

    private final NagjbrkcjxService nagjbrkcjxService;

    public NagjbrkcjxController(NagjbrkcjxService nagjbrkcjxService) {
        this.nagjbrkcjxService = nagjbrkcjxService;
    }

    @RequestMapping("/nagjbrkcjx")
    public String index() {
        return nagjbrkcjxService.getGreeting();
    }

}

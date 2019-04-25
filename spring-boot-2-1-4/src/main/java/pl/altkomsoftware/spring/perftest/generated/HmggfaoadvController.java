package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HmggfaoadvController {

    private final HmggfaoadvService hmggfaoadvService;

    public HmggfaoadvController(HmggfaoadvService hmggfaoadvService) {
        this.hmggfaoadvService = hmggfaoadvService;
    }

    @RequestMapping("/hmggfaoadv")
    public String index() {
        return hmggfaoadvService.getGreeting();
    }

}

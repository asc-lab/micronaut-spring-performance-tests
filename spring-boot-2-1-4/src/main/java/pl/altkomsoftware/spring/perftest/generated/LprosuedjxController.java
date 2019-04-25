package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LprosuedjxController {

    private final LprosuedjxService lprosuedjxService;

    public LprosuedjxController(LprosuedjxService lprosuedjxService) {
        this.lprosuedjxService = lprosuedjxService;
    }

    @RequestMapping("/lprosuedjx")
    public String index() {
        return lprosuedjxService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KfzoyrrbcxController {

    private final KfzoyrrbcxService kfzoyrrbcxService;

    public KfzoyrrbcxController(KfzoyrrbcxService kfzoyrrbcxService) {
        this.kfzoyrrbcxService = kfzoyrrbcxService;
    }

    @RequestMapping("/kfzoyrrbcx")
    public String index() {
        return kfzoyrrbcxService.getGreeting();
    }

}

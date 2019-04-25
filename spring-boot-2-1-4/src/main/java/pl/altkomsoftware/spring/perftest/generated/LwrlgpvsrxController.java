package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LwrlgpvsrxController {

    private final LwrlgpvsrxService lwrlgpvsrxService;

    public LwrlgpvsrxController(LwrlgpvsrxService lwrlgpvsrxService) {
        this.lwrlgpvsrxService = lwrlgpvsrxService;
    }

    @RequestMapping("/lwrlgpvsrx")
    public String index() {
        return lwrlgpvsrxService.getGreeting();
    }

}

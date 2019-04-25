package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LvtcainpbwController {

    private final LvtcainpbwService lvtcainpbwService;

    public LvtcainpbwController(LvtcainpbwService lvtcainpbwService) {
        this.lvtcainpbwService = lvtcainpbwService;
    }

    @RequestMapping("/lvtcainpbw")
    public String index() {
        return lvtcainpbwService.getGreeting();
    }

}

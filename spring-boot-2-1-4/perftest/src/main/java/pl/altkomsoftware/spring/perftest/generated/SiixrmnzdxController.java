package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SiixrmnzdxController {

    private final SiixrmnzdxService siixrmnzdxService;

    public SiixrmnzdxController(SiixrmnzdxService siixrmnzdxService) {
        this.siixrmnzdxService = siixrmnzdxService;
    }

    @RequestMapping("/siixrmnzdx")
    public String index() {
        return siixrmnzdxService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WgujephcvxController {

    private final WgujephcvxService wgujephcvxService;

    public WgujephcvxController(WgujephcvxService wgujephcvxService) {
        this.wgujephcvxService = wgujephcvxService;
    }

    @RequestMapping("/wgujephcvx")
    public String index() {
        return wgujephcvxService.getGreeting();
    }

}

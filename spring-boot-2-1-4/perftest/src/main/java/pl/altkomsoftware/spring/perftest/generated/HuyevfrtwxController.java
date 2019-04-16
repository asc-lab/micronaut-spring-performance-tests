package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HuyevfrtwxController {

    private final HuyevfrtwxService huyevfrtwxService;

    public HuyevfrtwxController(HuyevfrtwxService huyevfrtwxService) {
        this.huyevfrtwxService = huyevfrtwxService;
    }

    @RequestMapping("/huyevfrtwx")
    public String index() {
        return huyevfrtwxService.getGreeting();
    }

}

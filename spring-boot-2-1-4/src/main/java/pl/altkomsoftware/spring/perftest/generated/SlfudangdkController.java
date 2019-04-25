package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SlfudangdkController {

    private final SlfudangdkService slfudangdkService;

    public SlfudangdkController(SlfudangdkService slfudangdkService) {
        this.slfudangdkService = slfudangdkService;
    }

    @RequestMapping("/slfudangdk")
    public String index() {
        return slfudangdkService.getGreeting();
    }

}

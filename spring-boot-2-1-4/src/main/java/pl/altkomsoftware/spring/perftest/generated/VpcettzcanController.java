package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VpcettzcanController {

    private final VpcettzcanService vpcettzcanService;

    public VpcettzcanController(VpcettzcanService vpcettzcanService) {
        this.vpcettzcanService = vpcettzcanService;
    }

    @RequestMapping("/vpcettzcan")
    public String index() {
        return vpcettzcanService.getGreeting();
    }

}

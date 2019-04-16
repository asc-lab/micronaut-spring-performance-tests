package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NxktdaurgkController {

    private final NxktdaurgkService nxktdaurgkService;

    public NxktdaurgkController(NxktdaurgkService nxktdaurgkService) {
        this.nxktdaurgkService = nxktdaurgkService;
    }

    @RequestMapping("/nxktdaurgk")
    public String index() {
        return nxktdaurgkService.getGreeting();
    }

}

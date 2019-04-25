package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RtxfnvopkuController {

    private final RtxfnvopkuService rtxfnvopkuService;

    public RtxfnvopkuController(RtxfnvopkuService rtxfnvopkuService) {
        this.rtxfnvopkuService = rtxfnvopkuService;
    }

    @RequestMapping("/rtxfnvopku")
    public String index() {
        return rtxfnvopkuService.getGreeting();
    }

}

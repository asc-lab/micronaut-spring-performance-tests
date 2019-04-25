package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VppxgndtfqController {

    private final VppxgndtfqService vppxgndtfqService;

    public VppxgndtfqController(VppxgndtfqService vppxgndtfqService) {
        this.vppxgndtfqService = vppxgndtfqService;
    }

    @RequestMapping("/vppxgndtfq")
    public String index() {
        return vppxgndtfqService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VrxnxjsnepController {

    private final VrxnxjsnepService vrxnxjsnepService;

    public VrxnxjsnepController(VrxnxjsnepService vrxnxjsnepService) {
        this.vrxnxjsnepService = vrxnxjsnepService;
    }

    @RequestMapping("/vrxnxjsnep")
    public String index() {
        return vrxnxjsnepService.getGreeting();
    }

}

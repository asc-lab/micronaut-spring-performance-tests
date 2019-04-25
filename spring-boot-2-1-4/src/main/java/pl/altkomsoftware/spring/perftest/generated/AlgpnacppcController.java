package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class AlgpnacppcController {

    private final AlgpnacppcService algpnacppcService;

    public AlgpnacppcController(AlgpnacppcService algpnacppcService) {
        this.algpnacppcService = algpnacppcService;
    }

    @RequestMapping("/algpnacppc")
    public String index() {
        return algpnacppcService.getGreeting();
    }

}

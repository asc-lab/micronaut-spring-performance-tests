package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class VlcxocwpnlController {

    private final VlcxocwpnlService vlcxocwpnlService;

    public VlcxocwpnlController(VlcxocwpnlService vlcxocwpnlService) {
        this.vlcxocwpnlService = vlcxocwpnlService;
    }

    @RequestMapping("/vlcxocwpnl")
    public String index() {
        return vlcxocwpnlService.getGreeting();
    }

}

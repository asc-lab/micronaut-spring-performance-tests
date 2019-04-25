package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PklealrpvfController {

    private final PklealrpvfService pklealrpvfService;

    public PklealrpvfController(PklealrpvfService pklealrpvfService) {
        this.pklealrpvfService = pklealrpvfService;
    }

    @RequestMapping("/pklealrpvf")
    public String index() {
        return pklealrpvfService.getGreeting();
    }

}

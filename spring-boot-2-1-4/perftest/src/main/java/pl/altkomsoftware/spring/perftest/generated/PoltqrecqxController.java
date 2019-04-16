package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PoltqrecqxController {

    private final PoltqrecqxService poltqrecqxService;

    public PoltqrecqxController(PoltqrecqxService poltqrecqxService) {
        this.poltqrecqxService = poltqrecqxService;
    }

    @RequestMapping("/poltqrecqx")
    public String index() {
        return poltqrecqxService.getGreeting();
    }

}

package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PdnlgewopjController {

    private final PdnlgewopjService pdnlgewopjService;

    public PdnlgewopjController(PdnlgewopjService pdnlgewopjService) {
        this.pdnlgewopjService = pdnlgewopjService;
    }

    @RequestMapping("/pdnlgewopj")
    public String index() {
        return pdnlgewopjService.getGreeting();
    }

}

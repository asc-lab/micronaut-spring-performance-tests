package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CpcgoweouiController {

    private final CpcgoweouiService cpcgoweouiService;

    public CpcgoweouiController(CpcgoweouiService cpcgoweouiService) {
        this.cpcgoweouiService = cpcgoweouiService;
    }

    @RequestMapping("/cpcgoweoui")
    public String index() {
        return cpcgoweouiService.getGreeting();
    }

}

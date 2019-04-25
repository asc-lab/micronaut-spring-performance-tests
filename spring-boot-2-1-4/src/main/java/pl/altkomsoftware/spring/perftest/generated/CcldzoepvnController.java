package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CcldzoepvnController {

    private final CcldzoepvnService ccldzoepvnService;

    public CcldzoepvnController(CcldzoepvnService ccldzoepvnService) {
        this.ccldzoepvnService = ccldzoepvnService;
    }

    @RequestMapping("/ccldzoepvn")
    public String index() {
        return ccldzoepvnService.getGreeting();
    }

}

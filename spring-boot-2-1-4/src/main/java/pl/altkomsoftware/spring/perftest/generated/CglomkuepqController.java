package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CglomkuepqController {

    private final CglomkuepqService cglomkuepqService;

    public CglomkuepqController(CglomkuepqService cglomkuepqService) {
        this.cglomkuepqService = cglomkuepqService;
    }

    @RequestMapping("/cglomkuepq")
    public String index() {
        return cglomkuepqService.getGreeting();
    }

}

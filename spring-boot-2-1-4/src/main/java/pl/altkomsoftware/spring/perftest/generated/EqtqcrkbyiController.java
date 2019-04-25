package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EqtqcrkbyiController {

    private final EqtqcrkbyiService eqtqcrkbyiService;

    public EqtqcrkbyiController(EqtqcrkbyiService eqtqcrkbyiService) {
        this.eqtqcrkbyiService = eqtqcrkbyiService;
    }

    @RequestMapping("/eqtqcrkbyi")
    public String index() {
        return eqtqcrkbyiService.getGreeting();
    }

}

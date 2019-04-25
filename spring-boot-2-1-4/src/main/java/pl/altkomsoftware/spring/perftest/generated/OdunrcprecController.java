package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OdunrcprecController {

    private final OdunrcprecService odunrcprecService;

    public OdunrcprecController(OdunrcprecService odunrcprecService) {
        this.odunrcprecService = odunrcprecService;
    }

    @RequestMapping("/odunrcprec")
    public String index() {
        return odunrcprecService.getGreeting();
    }

}

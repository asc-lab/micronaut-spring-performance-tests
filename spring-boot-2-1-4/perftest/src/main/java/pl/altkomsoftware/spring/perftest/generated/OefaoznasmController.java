package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OefaoznasmController {

    private final OefaoznasmService oefaoznasmService;

    public OefaoznasmController(OefaoznasmService oefaoznasmService) {
        this.oefaoznasmService = oefaoznasmService;
    }

    @RequestMapping("/oefaoznasm")
    public String index() {
        return oefaoznasmService.getGreeting();
    }

}

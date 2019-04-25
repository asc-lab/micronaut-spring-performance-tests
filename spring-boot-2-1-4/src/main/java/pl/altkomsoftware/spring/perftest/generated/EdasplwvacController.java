package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EdasplwvacController {

    private final EdasplwvacService edasplwvacService;

    public EdasplwvacController(EdasplwvacService edasplwvacService) {
        this.edasplwvacService = edasplwvacService;
    }

    @RequestMapping("/edasplwvac")
    public String index() {
        return edasplwvacService.getGreeting();
    }

}

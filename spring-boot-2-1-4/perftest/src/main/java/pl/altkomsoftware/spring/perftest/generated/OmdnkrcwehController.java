package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OmdnkrcwehController {

    private final OmdnkrcwehService omdnkrcwehService;

    public OmdnkrcwehController(OmdnkrcwehService omdnkrcwehService) {
        this.omdnkrcwehService = omdnkrcwehService;
    }

    @RequestMapping("/omdnkrcweh")
    public String index() {
        return omdnkrcwehService.getGreeting();
    }

}

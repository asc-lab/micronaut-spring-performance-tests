package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OuxcagwxmzController {

    private final OuxcagwxmzService ouxcagwxmzService;

    public OuxcagwxmzController(OuxcagwxmzService ouxcagwxmzService) {
        this.ouxcagwxmzService = ouxcagwxmzService;
    }

    @RequestMapping("/ouxcagwxmz")
    public String index() {
        return ouxcagwxmzService.getGreeting();
    }

}

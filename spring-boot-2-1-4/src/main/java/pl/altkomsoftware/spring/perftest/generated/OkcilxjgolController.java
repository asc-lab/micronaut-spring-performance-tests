package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OkcilxjgolController {

    private final OkcilxjgolService okcilxjgolService;

    public OkcilxjgolController(OkcilxjgolService okcilxjgolService) {
        this.okcilxjgolService = okcilxjgolService;
    }

    @RequestMapping("/okcilxjgol")
    public String index() {
        return okcilxjgolService.getGreeting();
    }

}

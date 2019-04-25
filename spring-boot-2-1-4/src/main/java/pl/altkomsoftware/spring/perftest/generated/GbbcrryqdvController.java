package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GbbcrryqdvController {

    private final GbbcrryqdvService gbbcrryqdvService;

    public GbbcrryqdvController(GbbcrryqdvService gbbcrryqdvService) {
        this.gbbcrryqdvService = gbbcrryqdvService;
    }

    @RequestMapping("/gbbcrryqdv")
    public String index() {
        return gbbcrryqdvService.getGreeting();
    }

}

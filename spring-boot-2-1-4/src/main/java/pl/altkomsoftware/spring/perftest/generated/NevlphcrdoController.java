package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class NevlphcrdoController {

    private final NevlphcrdoService nevlphcrdoService;

    public NevlphcrdoController(NevlphcrdoService nevlphcrdoService) {
        this.nevlphcrdoService = nevlphcrdoService;
    }

    @RequestMapping("/nevlphcrdo")
    public String index() {
        return nevlphcrdoService.getGreeting();
    }

}

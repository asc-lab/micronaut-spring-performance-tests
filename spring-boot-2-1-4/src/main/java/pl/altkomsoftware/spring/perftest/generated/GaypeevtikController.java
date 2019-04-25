package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GaypeevtikController {

    private final GaypeevtikService gaypeevtikService;

    public GaypeevtikController(GaypeevtikService gaypeevtikService) {
        this.gaypeevtikService = gaypeevtikService;
    }

    @RequestMapping("/gaypeevtik")
    public String index() {
        return gaypeevtikService.getGreeting();
    }

}

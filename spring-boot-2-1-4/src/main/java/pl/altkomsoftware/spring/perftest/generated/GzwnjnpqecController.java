package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GzwnjnpqecController {

    private final GzwnjnpqecService gzwnjnpqecService;

    public GzwnjnpqecController(GzwnjnpqecService gzwnjnpqecService) {
        this.gzwnjnpqecService = gzwnjnpqecService;
    }

    @RequestMapping("/gzwnjnpqec")
    public String index() {
        return gzwnjnpqecService.getGreeting();
    }

}

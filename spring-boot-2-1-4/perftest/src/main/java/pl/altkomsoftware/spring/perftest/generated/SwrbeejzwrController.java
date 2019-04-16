package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SwrbeejzwrController {

    private final SwrbeejzwrService swrbeejzwrService;

    public SwrbeejzwrController(SwrbeejzwrService swrbeejzwrService) {
        this.swrbeejzwrService = swrbeejzwrService;
    }

    @RequestMapping("/swrbeejzwr")
    public String index() {
        return swrbeejzwrService.getGreeting();
    }

}

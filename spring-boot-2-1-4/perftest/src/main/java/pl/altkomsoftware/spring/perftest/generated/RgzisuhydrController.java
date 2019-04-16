package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class RgzisuhydrController {

    private final RgzisuhydrService rgzisuhydrService;

    public RgzisuhydrController(RgzisuhydrService rgzisuhydrService) {
        this.rgzisuhydrService = rgzisuhydrService;
    }

    @RequestMapping("/rgzisuhydr")
    public String index() {
        return rgzisuhydrService.getGreeting();
    }

}

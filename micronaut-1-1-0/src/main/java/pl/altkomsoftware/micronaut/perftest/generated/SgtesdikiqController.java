package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sgtesdikiq")
public class SgtesdikiqController {

    private final SgtesdikiqService sgtesdikiqService;

    public SgtesdikiqController(SgtesdikiqService sgtesdikiqService) {
        this.sgtesdikiqService = sgtesdikiqService;
    }

    @Get("/")
    public String index() {
        return sgtesdikiqService.getGreeting();
    }
}

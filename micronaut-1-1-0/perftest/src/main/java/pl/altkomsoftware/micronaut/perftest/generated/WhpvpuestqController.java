package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/whpvpuestq")
public class WhpvpuestqController {

    private final WhpvpuestqService whpvpuestqService;

    public WhpvpuestqController(WhpvpuestqService whpvpuestqService) {
        this.whpvpuestqService = whpvpuestqService;
    }

    @Get("/")
    public String index() {
        return whpvpuestqService.getGreeting();
    }
}

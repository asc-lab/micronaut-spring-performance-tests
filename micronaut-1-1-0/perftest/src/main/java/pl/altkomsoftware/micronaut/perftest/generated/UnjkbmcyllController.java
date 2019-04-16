package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/unjkbmcyll")
public class UnjkbmcyllController {

    private final UnjkbmcyllService unjkbmcyllService;

    public UnjkbmcyllController(UnjkbmcyllService unjkbmcyllService) {
        this.unjkbmcyllService = unjkbmcyllService;
    }

    @Get("/")
    public String index() {
        return unjkbmcyllService.getGreeting();
    }
}

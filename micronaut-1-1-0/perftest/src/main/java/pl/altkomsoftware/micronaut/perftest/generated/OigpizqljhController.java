package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oigpizqljh")
public class OigpizqljhController {

    private final OigpizqljhService oigpizqljhService;

    public OigpizqljhController(OigpizqljhService oigpizqljhService) {
        this.oigpizqljhService = oigpizqljhService;
    }

    @Get("/")
    public String index() {
        return oigpizqljhService.getGreeting();
    }
}

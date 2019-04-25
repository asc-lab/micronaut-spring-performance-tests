package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/puibhrjnqz")
public class PuibhrjnqzController {

    private final PuibhrjnqzService puibhrjnqzService;

    public PuibhrjnqzController(PuibhrjnqzService puibhrjnqzService) {
        this.puibhrjnqzService = puibhrjnqzService;
    }

    @Get("/")
    public String index() {
        return puibhrjnqzService.getGreeting();
    }
}

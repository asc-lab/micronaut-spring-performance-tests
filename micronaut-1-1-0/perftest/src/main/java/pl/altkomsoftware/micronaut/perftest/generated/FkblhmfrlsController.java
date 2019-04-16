package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fkblhmfrls")
public class FkblhmfrlsController {

    private final FkblhmfrlsService fkblhmfrlsService;

    public FkblhmfrlsController(FkblhmfrlsService fkblhmfrlsService) {
        this.fkblhmfrlsService = fkblhmfrlsService;
    }

    @Get("/")
    public String index() {
        return fkblhmfrlsService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dledghqbjs")
public class DledghqbjsController {

    private final DledghqbjsService dledghqbjsService;

    public DledghqbjsController(DledghqbjsService dledghqbjsService) {
        this.dledghqbjsService = dledghqbjsService;
    }

    @Get("/")
    public String index() {
        return dledghqbjsService.getGreeting();
    }
}

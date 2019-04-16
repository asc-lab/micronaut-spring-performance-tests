package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tributqmzg")
public class TributqmzgController {

    private final TributqmzgService tributqmzgService;

    public TributqmzgController(TributqmzgService tributqmzgService) {
        this.tributqmzgService = tributqmzgService;
    }

    @Get("/")
    public String index() {
        return tributqmzgService.getGreeting();
    }
}

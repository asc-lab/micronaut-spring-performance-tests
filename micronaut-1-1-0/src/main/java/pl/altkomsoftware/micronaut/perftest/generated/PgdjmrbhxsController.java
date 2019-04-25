package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pgdjmrbhxs")
public class PgdjmrbhxsController {

    private final PgdjmrbhxsService pgdjmrbhxsService;

    public PgdjmrbhxsController(PgdjmrbhxsService pgdjmrbhxsService) {
        this.pgdjmrbhxsService = pgdjmrbhxsService;
    }

    @Get("/")
    public String index() {
        return pgdjmrbhxsService.getGreeting();
    }
}

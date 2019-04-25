package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pgrdagwnqf")
public class PgrdagwnqfController {

    private final PgrdagwnqfService pgrdagwnqfService;

    public PgrdagwnqfController(PgrdagwnqfService pgrdagwnqfService) {
        this.pgrdagwnqfService = pgrdagwnqfService;
    }

    @Get("/")
    public String index() {
        return pgrdagwnqfService.getGreeting();
    }
}

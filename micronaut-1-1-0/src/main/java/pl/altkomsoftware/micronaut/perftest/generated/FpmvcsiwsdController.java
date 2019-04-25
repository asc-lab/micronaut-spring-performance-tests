package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fpmvcsiwsd")
public class FpmvcsiwsdController {

    private final FpmvcsiwsdService fpmvcsiwsdService;

    public FpmvcsiwsdController(FpmvcsiwsdService fpmvcsiwsdService) {
        this.fpmvcsiwsdService = fpmvcsiwsdService;
    }

    @Get("/")
    public String index() {
        return fpmvcsiwsdService.getGreeting();
    }
}

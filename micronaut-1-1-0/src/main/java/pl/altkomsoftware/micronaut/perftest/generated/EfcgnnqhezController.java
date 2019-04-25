package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/efcgnnqhez")
public class EfcgnnqhezController {

    private final EfcgnnqhezService efcgnnqhezService;

    public EfcgnnqhezController(EfcgnnqhezService efcgnnqhezService) {
        this.efcgnnqhezService = efcgnnqhezService;
    }

    @Get("/")
    public String index() {
        return efcgnnqhezService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/edeawxlfau")
public class EdeawxlfauController {

    private final EdeawxlfauService edeawxlfauService;

    public EdeawxlfauController(EdeawxlfauService edeawxlfauService) {
        this.edeawxlfauService = edeawxlfauService;
    }

    @Get("/")
    public String index() {
        return edeawxlfauService.getGreeting();
    }
}

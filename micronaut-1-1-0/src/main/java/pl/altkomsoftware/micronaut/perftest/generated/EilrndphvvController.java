package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eilrndphvv")
public class EilrndphvvController {

    private final EilrndphvvService eilrndphvvService;

    public EilrndphvvController(EilrndphvvService eilrndphvvService) {
        this.eilrndphvvService = eilrndphvvService;
    }

    @Get("/")
    public String index() {
        return eilrndphvvService.getGreeting();
    }
}

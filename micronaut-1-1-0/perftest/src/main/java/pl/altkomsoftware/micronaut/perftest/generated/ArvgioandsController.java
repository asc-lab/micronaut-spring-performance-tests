package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/arvgioands")
public class ArvgioandsController {

    private final ArvgioandsService arvgioandsService;

    public ArvgioandsController(ArvgioandsService arvgioandsService) {
        this.arvgioandsService = arvgioandsService;
    }

    @Get("/")
    public String index() {
        return arvgioandsService.getGreeting();
    }
}

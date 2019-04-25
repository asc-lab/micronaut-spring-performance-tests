package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ahdazjjyia")
public class AhdazjjyiaController {

    private final AhdazjjyiaService ahdazjjyiaService;

    public AhdazjjyiaController(AhdazjjyiaService ahdazjjyiaService) {
        this.ahdazjjyiaService = ahdazjjyiaService;
    }

    @Get("/")
    public String index() {
        return ahdazjjyiaService.getGreeting();
    }
}

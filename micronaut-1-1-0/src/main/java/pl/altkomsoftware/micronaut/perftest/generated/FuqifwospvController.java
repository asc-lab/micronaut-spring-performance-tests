package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fuqifwospv")
public class FuqifwospvController {

    private final FuqifwospvService fuqifwospvService;

    public FuqifwospvController(FuqifwospvService fuqifwospvService) {
        this.fuqifwospvService = fuqifwospvService;
    }

    @Get("/")
    public String index() {
        return fuqifwospvService.getGreeting();
    }
}

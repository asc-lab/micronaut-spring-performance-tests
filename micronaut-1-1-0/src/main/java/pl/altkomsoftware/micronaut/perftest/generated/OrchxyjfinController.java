package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/orchxyjfin")
public class OrchxyjfinController {

    private final OrchxyjfinService orchxyjfinService;

    public OrchxyjfinController(OrchxyjfinService orchxyjfinService) {
        this.orchxyjfinService = orchxyjfinService;
    }

    @Get("/")
    public String index() {
        return orchxyjfinService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ugkggbnbpv")
public class UgkggbnbpvController {

    private final UgkggbnbpvService ugkggbnbpvService;

    public UgkggbnbpvController(UgkggbnbpvService ugkggbnbpvService) {
        this.ugkggbnbpvService = ugkggbnbpvService;
    }

    @Get("/")
    public String index() {
        return ugkggbnbpvService.getGreeting();
    }
}

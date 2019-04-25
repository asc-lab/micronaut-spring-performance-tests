package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ugvqizecja")
public class UgvqizecjaController {

    private final UgvqizecjaService ugvqizecjaService;

    public UgvqizecjaController(UgvqizecjaService ugvqizecjaService) {
        this.ugvqizecjaService = ugvqizecjaService;
    }

    @Get("/")
    public String index() {
        return ugvqizecjaService.getGreeting();
    }
}

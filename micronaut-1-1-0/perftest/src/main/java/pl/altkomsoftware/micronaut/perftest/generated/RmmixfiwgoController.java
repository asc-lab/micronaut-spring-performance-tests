package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rmmixfiwgo")
public class RmmixfiwgoController {

    private final RmmixfiwgoService rmmixfiwgoService;

    public RmmixfiwgoController(RmmixfiwgoService rmmixfiwgoService) {
        this.rmmixfiwgoService = rmmixfiwgoService;
    }

    @Get("/")
    public String index() {
        return rmmixfiwgoService.getGreeting();
    }
}

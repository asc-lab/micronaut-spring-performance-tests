package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rzfvqvabao")
public class RzfvqvabaoController {

    private final RzfvqvabaoService rzfvqvabaoService;

    public RzfvqvabaoController(RzfvqvabaoService rzfvqvabaoService) {
        this.rzfvqvabaoService = rzfvqvabaoService;
    }

    @Get("/")
    public String index() {
        return rzfvqvabaoService.getGreeting();
    }
}

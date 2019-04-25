package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/npxmpuxgft")
public class NpxmpuxgftController {

    private final NpxmpuxgftService npxmpuxgftService;

    public NpxmpuxgftController(NpxmpuxgftService npxmpuxgftService) {
        this.npxmpuxgftService = npxmpuxgftService;
    }

    @Get("/")
    public String index() {
        return npxmpuxgftService.getGreeting();
    }
}

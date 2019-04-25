package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tqgmblejsb")
public class TqgmblejsbController {

    private final TqgmblejsbService tqgmblejsbService;

    public TqgmblejsbController(TqgmblejsbService tqgmblejsbService) {
        this.tqgmblejsbService = tqgmblejsbService;
    }

    @Get("/")
    public String index() {
        return tqgmblejsbService.getGreeting();
    }
}

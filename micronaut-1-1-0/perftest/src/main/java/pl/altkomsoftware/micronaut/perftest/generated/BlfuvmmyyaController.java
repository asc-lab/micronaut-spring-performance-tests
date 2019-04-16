package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/blfuvmmyya")
public class BlfuvmmyyaController {

    private final BlfuvmmyyaService blfuvmmyyaService;

    public BlfuvmmyyaController(BlfuvmmyyaService blfuvmmyyaService) {
        this.blfuvmmyyaService = blfuvmmyyaService;
    }

    @Get("/")
    public String index() {
        return blfuvmmyyaService.getGreeting();
    }
}

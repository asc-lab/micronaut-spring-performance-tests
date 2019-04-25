package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eocjytuacj")
public class EocjytuacjController {

    private final EocjytuacjService eocjytuacjService;

    public EocjytuacjController(EocjytuacjService eocjytuacjService) {
        this.eocjytuacjService = eocjytuacjService;
    }

    @Get("/")
    public String index() {
        return eocjytuacjService.getGreeting();
    }
}

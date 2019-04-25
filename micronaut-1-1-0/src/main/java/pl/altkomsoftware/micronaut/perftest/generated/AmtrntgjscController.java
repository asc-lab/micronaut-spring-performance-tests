package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/amtrntgjsc")
public class AmtrntgjscController {

    private final AmtrntgjscService amtrntgjscService;

    public AmtrntgjscController(AmtrntgjscService amtrntgjscService) {
        this.amtrntgjscService = amtrntgjscService;
    }

    @Get("/")
    public String index() {
        return amtrntgjscService.getGreeting();
    }
}

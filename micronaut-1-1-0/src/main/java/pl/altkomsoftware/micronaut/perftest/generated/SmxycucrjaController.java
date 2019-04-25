package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/smxycucrja")
public class SmxycucrjaController {

    private final SmxycucrjaService smxycucrjaService;

    public SmxycucrjaController(SmxycucrjaService smxycucrjaService) {
        this.smxycucrjaService = smxycucrjaService;
    }

    @Get("/")
    public String index() {
        return smxycucrjaService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/afkclhjxkq")
public class AfkclhjxkqController {

    private final AfkclhjxkqService afkclhjxkqService;

    public AfkclhjxkqController(AfkclhjxkqService afkclhjxkqService) {
        this.afkclhjxkqService = afkclhjxkqService;
    }

    @Get("/")
    public String index() {
        return afkclhjxkqService.getGreeting();
    }
}

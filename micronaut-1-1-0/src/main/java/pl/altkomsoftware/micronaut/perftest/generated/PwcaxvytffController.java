package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pwcaxvytff")
public class PwcaxvytffController {

    private final PwcaxvytffService pwcaxvytffService;

    public PwcaxvytffController(PwcaxvytffService pwcaxvytffService) {
        this.pwcaxvytffService = pwcaxvytffService;
    }

    @Get("/")
    public String index() {
        return pwcaxvytffService.getGreeting();
    }
}

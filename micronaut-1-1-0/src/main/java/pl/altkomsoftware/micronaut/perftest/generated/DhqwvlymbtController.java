package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dhqwvlymbt")
public class DhqwvlymbtController {

    private final DhqwvlymbtService dhqwvlymbtService;

    public DhqwvlymbtController(DhqwvlymbtService dhqwvlymbtService) {
        this.dhqwvlymbtService = dhqwvlymbtService;
    }

    @Get("/")
    public String index() {
        return dhqwvlymbtService.getGreeting();
    }
}

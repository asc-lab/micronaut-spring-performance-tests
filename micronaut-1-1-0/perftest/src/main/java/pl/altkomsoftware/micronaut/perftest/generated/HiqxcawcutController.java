package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hiqxcawcut")
public class HiqxcawcutController {

    private final HiqxcawcutService hiqxcawcutService;

    public HiqxcawcutController(HiqxcawcutService hiqxcawcutService) {
        this.hiqxcawcutService = hiqxcawcutService;
    }

    @Get("/")
    public String index() {
        return hiqxcawcutService.getGreeting();
    }
}

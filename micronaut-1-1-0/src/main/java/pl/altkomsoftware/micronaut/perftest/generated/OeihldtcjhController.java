package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oeihldtcjh")
public class OeihldtcjhController {

    private final OeihldtcjhService oeihldtcjhService;

    public OeihldtcjhController(OeihldtcjhService oeihldtcjhService) {
        this.oeihldtcjhService = oeihldtcjhService;
    }

    @Get("/")
    public String index() {
        return oeihldtcjhService.getGreeting();
    }
}

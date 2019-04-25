package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/suwhdhfeoi")
public class SuwhdhfeoiController {

    private final SuwhdhfeoiService suwhdhfeoiService;

    public SuwhdhfeoiController(SuwhdhfeoiService suwhdhfeoiService) {
        this.suwhdhfeoiService = suwhdhfeoiService;
    }

    @Get("/")
    public String index() {
        return suwhdhfeoiService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mthdaeytyi")
public class MthdaeytyiController {

    private final MthdaeytyiService mthdaeytyiService;

    public MthdaeytyiController(MthdaeytyiService mthdaeytyiService) {
        this.mthdaeytyiService = mthdaeytyiService;
    }

    @Get("/")
    public String index() {
        return mthdaeytyiService.getGreeting();
    }
}

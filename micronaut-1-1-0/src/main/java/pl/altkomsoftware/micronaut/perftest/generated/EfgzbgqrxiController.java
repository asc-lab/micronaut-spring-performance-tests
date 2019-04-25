package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/efgzbgqrxi")
public class EfgzbgqrxiController {

    private final EfgzbgqrxiService efgzbgqrxiService;

    public EfgzbgqrxiController(EfgzbgqrxiService efgzbgqrxiService) {
        this.efgzbgqrxiService = efgzbgqrxiService;
    }

    @Get("/")
    public String index() {
        return efgzbgqrxiService.getGreeting();
    }
}

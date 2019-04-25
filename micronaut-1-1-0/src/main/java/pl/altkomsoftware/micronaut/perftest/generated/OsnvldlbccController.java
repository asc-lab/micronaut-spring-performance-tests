package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/osnvldlbcc")
public class OsnvldlbccController {

    private final OsnvldlbccService osnvldlbccService;

    public OsnvldlbccController(OsnvldlbccService osnvldlbccService) {
        this.osnvldlbccService = osnvldlbccService;
    }

    @Get("/")
    public String index() {
        return osnvldlbccService.getGreeting();
    }
}

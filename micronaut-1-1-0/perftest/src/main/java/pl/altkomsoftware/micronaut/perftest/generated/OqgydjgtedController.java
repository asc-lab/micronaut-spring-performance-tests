package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oqgydjgted")
public class OqgydjgtedController {

    private final OqgydjgtedService oqgydjgtedService;

    public OqgydjgtedController(OqgydjgtedService oqgydjgtedService) {
        this.oqgydjgtedService = oqgydjgtedService;
    }

    @Get("/")
    public String index() {
        return oqgydjgtedService.getGreeting();
    }
}

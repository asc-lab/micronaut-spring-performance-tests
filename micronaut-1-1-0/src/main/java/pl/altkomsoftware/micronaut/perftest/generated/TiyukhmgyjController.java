package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tiyukhmgyj")
public class TiyukhmgyjController {

    private final TiyukhmgyjService tiyukhmgyjService;

    public TiyukhmgyjController(TiyukhmgyjService tiyukhmgyjService) {
        this.tiyukhmgyjService = tiyukhmgyjService;
    }

    @Get("/")
    public String index() {
        return tiyukhmgyjService.getGreeting();
    }
}

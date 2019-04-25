package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cnxwidkqgl")
public class CnxwidkqglController {

    private final CnxwidkqglService cnxwidkqglService;

    public CnxwidkqglController(CnxwidkqglService cnxwidkqglService) {
        this.cnxwidkqglService = cnxwidkqglService;
    }

    @Get("/")
    public String index() {
        return cnxwidkqglService.getGreeting();
    }
}

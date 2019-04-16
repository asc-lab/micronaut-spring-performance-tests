package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dsemwodptr")
public class DsemwodptrController {

    private final DsemwodptrService dsemwodptrService;

    public DsemwodptrController(DsemwodptrService dsemwodptrService) {
        this.dsemwodptrService = dsemwodptrService;
    }

    @Get("/")
    public String index() {
        return dsemwodptrService.getGreeting();
    }
}

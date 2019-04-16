package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hvrkichjat")
public class HvrkichjatController {

    private final HvrkichjatService hvrkichjatService;

    public HvrkichjatController(HvrkichjatService hvrkichjatService) {
        this.hvrkichjatService = hvrkichjatService;
    }

    @Get("/")
    public String index() {
        return hvrkichjatService.getGreeting();
    }
}

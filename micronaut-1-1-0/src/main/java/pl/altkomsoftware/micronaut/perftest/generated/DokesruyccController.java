package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dokesruycc")
public class DokesruyccController {

    private final DokesruyccService dokesruyccService;

    public DokesruyccController(DokesruyccService dokesruyccService) {
        this.dokesruyccService = dokesruyccService;
    }

    @Get("/")
    public String index() {
        return dokesruyccService.getGreeting();
    }
}

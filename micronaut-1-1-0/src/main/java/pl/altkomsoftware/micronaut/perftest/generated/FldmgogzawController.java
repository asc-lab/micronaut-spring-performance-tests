package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fldmgogzaw")
public class FldmgogzawController {

    private final FldmgogzawService fldmgogzawService;

    public FldmgogzawController(FldmgogzawService fldmgogzawService) {
        this.fldmgogzawService = fldmgogzawService;
    }

    @Get("/")
    public String index() {
        return fldmgogzawService.getGreeting();
    }
}

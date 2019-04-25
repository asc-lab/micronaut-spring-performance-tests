package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ucnbtunzrc")
public class UcnbtunzrcController {

    private final UcnbtunzrcService ucnbtunzrcService;

    public UcnbtunzrcController(UcnbtunzrcService ucnbtunzrcService) {
        this.ucnbtunzrcService = ucnbtunzrcService;
    }

    @Get("/")
    public String index() {
        return ucnbtunzrcService.getGreeting();
    }
}

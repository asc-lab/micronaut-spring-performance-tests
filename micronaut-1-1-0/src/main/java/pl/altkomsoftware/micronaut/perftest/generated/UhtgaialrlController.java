package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uhtgaialrl")
public class UhtgaialrlController {

    private final UhtgaialrlService uhtgaialrlService;

    public UhtgaialrlController(UhtgaialrlService uhtgaialrlService) {
        this.uhtgaialrlService = uhtgaialrlService;
    }

    @Get("/")
    public String index() {
        return uhtgaialrlService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aewchpyxhn")
public class AewchpyxhnController {

    private final AewchpyxhnService aewchpyxhnService;

    public AewchpyxhnController(AewchpyxhnService aewchpyxhnService) {
        this.aewchpyxhnService = aewchpyxhnService;
    }

    @Get("/")
    public String index() {
        return aewchpyxhnService.getGreeting();
    }
}

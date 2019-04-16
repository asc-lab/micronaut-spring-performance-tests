package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fzmqldfbgb")
public class FzmqldfbgbController {

    private final FzmqldfbgbService fzmqldfbgbService;

    public FzmqldfbgbController(FzmqldfbgbService fzmqldfbgbService) {
        this.fzmqldfbgbService = fzmqldfbgbService;
    }

    @Get("/")
    public String index() {
        return fzmqldfbgbService.getGreeting();
    }
}

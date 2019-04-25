package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fxprkouoqy")
public class FxprkouoqyController {

    private final FxprkouoqyService fxprkouoqyService;

    public FxprkouoqyController(FxprkouoqyService fxprkouoqyService) {
        this.fxprkouoqyService = fxprkouoqyService;
    }

    @Get("/")
    public String index() {
        return fxprkouoqyService.getGreeting();
    }
}

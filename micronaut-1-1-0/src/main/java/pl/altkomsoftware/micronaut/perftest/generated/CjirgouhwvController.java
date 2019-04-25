package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cjirgouhwv")
public class CjirgouhwvController {

    private final CjirgouhwvService cjirgouhwvService;

    public CjirgouhwvController(CjirgouhwvService cjirgouhwvService) {
        this.cjirgouhwvService = cjirgouhwvService;
    }

    @Get("/")
    public String index() {
        return cjirgouhwvService.getGreeting();
    }
}

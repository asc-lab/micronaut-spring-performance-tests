package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kcsjhbutse")
public class KcsjhbutseController {

    private final KcsjhbutseService kcsjhbutseService;

    public KcsjhbutseController(KcsjhbutseService kcsjhbutseService) {
        this.kcsjhbutseService = kcsjhbutseService;
    }

    @Get("/")
    public String index() {
        return kcsjhbutseService.getGreeting();
    }
}

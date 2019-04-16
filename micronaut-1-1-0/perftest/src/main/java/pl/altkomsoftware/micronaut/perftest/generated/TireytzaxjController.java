package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tireytzaxj")
public class TireytzaxjController {

    private final TireytzaxjService tireytzaxjService;

    public TireytzaxjController(TireytzaxjService tireytzaxjService) {
        this.tireytzaxjService = tireytzaxjService;
    }

    @Get("/")
    public String index() {
        return tireytzaxjService.getGreeting();
    }
}

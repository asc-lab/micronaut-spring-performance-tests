package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gqrlfyfpbl")
public class GqrlfyfpblController {

    private final GqrlfyfpblService gqrlfyfpblService;

    public GqrlfyfpblController(GqrlfyfpblService gqrlfyfpblService) {
        this.gqrlfyfpblService = gqrlfyfpblService;
    }

    @Get("/")
    public String index() {
        return gqrlfyfpblService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/prbjklifbz")
public class PrbjklifbzController {

    private final PrbjklifbzService prbjklifbzService;

    public PrbjklifbzController(PrbjklifbzService prbjklifbzService) {
        this.prbjklifbzService = prbjklifbzService;
    }

    @Get("/")
    public String index() {
        return prbjklifbzService.getGreeting();
    }
}

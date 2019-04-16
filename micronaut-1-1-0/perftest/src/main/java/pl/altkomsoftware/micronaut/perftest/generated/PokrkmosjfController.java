package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pokrkmosjf")
public class PokrkmosjfController {

    private final PokrkmosjfService pokrkmosjfService;

    public PokrkmosjfController(PokrkmosjfService pokrkmosjfService) {
        this.pokrkmosjfService = pokrkmosjfService;
    }

    @Get("/")
    public String index() {
        return pokrkmosjfService.getGreeting();
    }
}

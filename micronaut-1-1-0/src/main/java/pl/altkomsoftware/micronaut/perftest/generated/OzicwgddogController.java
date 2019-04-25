package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ozicwgddog")
public class OzicwgddogController {

    private final OzicwgddogService ozicwgddogService;

    public OzicwgddogController(OzicwgddogService ozicwgddogService) {
        this.ozicwgddogService = ozicwgddogService;
    }

    @Get("/")
    public String index() {
        return ozicwgddogService.getGreeting();
    }
}

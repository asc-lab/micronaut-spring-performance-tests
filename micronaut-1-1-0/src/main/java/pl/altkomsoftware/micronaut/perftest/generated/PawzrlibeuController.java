package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pawzrlibeu")
public class PawzrlibeuController {

    private final PawzrlibeuService pawzrlibeuService;

    public PawzrlibeuController(PawzrlibeuService pawzrlibeuService) {
        this.pawzrlibeuService = pawzrlibeuService;
    }

    @Get("/")
    public String index() {
        return pawzrlibeuService.getGreeting();
    }
}

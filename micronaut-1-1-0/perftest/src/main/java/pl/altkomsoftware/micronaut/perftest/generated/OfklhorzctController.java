package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ofklhorzct")
public class OfklhorzctController {

    private final OfklhorzctService ofklhorzctService;

    public OfklhorzctController(OfklhorzctService ofklhorzctService) {
        this.ofklhorzctService = ofklhorzctService;
    }

    @Get("/")
    public String index() {
        return ofklhorzctService.getGreeting();
    }
}

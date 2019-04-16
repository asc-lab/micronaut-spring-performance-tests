package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aglzxrzfac")
public class AglzxrzfacController {

    private final AglzxrzfacService aglzxrzfacService;

    public AglzxrzfacController(AglzxrzfacService aglzxrzfacService) {
        this.aglzxrzfacService = aglzxrzfacService;
    }

    @Get("/")
    public String index() {
        return aglzxrzfacService.getGreeting();
    }
}

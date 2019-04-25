package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zlonupqvsy")
public class ZlonupqvsyController {

    private final ZlonupqvsyService zlonupqvsyService;

    public ZlonupqvsyController(ZlonupqvsyService zlonupqvsyService) {
        this.zlonupqvsyService = zlonupqvsyService;
    }

    @Get("/")
    public String index() {
        return zlonupqvsyService.getGreeting();
    }
}

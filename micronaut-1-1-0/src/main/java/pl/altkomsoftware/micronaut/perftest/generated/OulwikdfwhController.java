package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oulwikdfwh")
public class OulwikdfwhController {

    private final OulwikdfwhService oulwikdfwhService;

    public OulwikdfwhController(OulwikdfwhService oulwikdfwhService) {
        this.oulwikdfwhService = oulwikdfwhService;
    }

    @Get("/")
    public String index() {
        return oulwikdfwhService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gliepzmdmh")
public class GliepzmdmhController {

    private final GliepzmdmhService gliepzmdmhService;

    public GliepzmdmhController(GliepzmdmhService gliepzmdmhService) {
        this.gliepzmdmhService = gliepzmdmhService;
    }

    @Get("/")
    public String index() {
        return gliepzmdmhService.getGreeting();
    }
}

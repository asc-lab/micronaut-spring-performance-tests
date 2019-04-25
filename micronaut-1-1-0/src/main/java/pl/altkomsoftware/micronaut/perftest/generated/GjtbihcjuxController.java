package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gjtbihcjux")
public class GjtbihcjuxController {

    private final GjtbihcjuxService gjtbihcjuxService;

    public GjtbihcjuxController(GjtbihcjuxService gjtbihcjuxService) {
        this.gjtbihcjuxService = gjtbihcjuxService;
    }

    @Get("/")
    public String index() {
        return gjtbihcjuxService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/galgvcvszc")
public class GalgvcvszcController {

    private final GalgvcvszcService galgvcvszcService;

    public GalgvcvszcController(GalgvcvszcService galgvcvszcService) {
        this.galgvcvszcService = galgvcvszcService;
    }

    @Get("/")
    public String index() {
        return galgvcvszcService.getGreeting();
    }
}

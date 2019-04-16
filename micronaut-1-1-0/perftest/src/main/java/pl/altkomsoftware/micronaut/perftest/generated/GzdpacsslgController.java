package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gzdpacsslg")
public class GzdpacsslgController {

    private final GzdpacsslgService gzdpacsslgService;

    public GzdpacsslgController(GzdpacsslgService gzdpacsslgService) {
        this.gzdpacsslgService = gzdpacsslgService;
    }

    @Get("/")
    public String index() {
        return gzdpacsslgService.getGreeting();
    }
}

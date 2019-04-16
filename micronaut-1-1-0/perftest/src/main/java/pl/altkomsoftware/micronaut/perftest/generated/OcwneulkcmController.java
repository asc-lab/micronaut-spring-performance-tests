package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ocwneulkcm")
public class OcwneulkcmController {

    private final OcwneulkcmService ocwneulkcmService;

    public OcwneulkcmController(OcwneulkcmService ocwneulkcmService) {
        this.ocwneulkcmService = ocwneulkcmService;
    }

    @Get("/")
    public String index() {
        return ocwneulkcmService.getGreeting();
    }
}

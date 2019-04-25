package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rggnrzkkgf")
public class RggnrzkkgfController {

    private final RggnrzkkgfService rggnrzkkgfService;

    public RggnrzkkgfController(RggnrzkkgfService rggnrzkkgfService) {
        this.rggnrzkkgfService = rggnrzkkgfService;
    }

    @Get("/")
    public String index() {
        return rggnrzkkgfService.getGreeting();
    }
}

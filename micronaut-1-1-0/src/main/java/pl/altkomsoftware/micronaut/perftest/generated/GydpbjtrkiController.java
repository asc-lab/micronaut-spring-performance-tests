package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gydpbjtrki")
public class GydpbjtrkiController {

    private final GydpbjtrkiService gydpbjtrkiService;

    public GydpbjtrkiController(GydpbjtrkiService gydpbjtrkiService) {
        this.gydpbjtrkiService = gydpbjtrkiService;
    }

    @Get("/")
    public String index() {
        return gydpbjtrkiService.getGreeting();
    }
}

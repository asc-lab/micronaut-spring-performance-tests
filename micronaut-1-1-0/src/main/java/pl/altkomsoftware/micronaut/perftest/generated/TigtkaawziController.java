package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tigtkaawzi")
public class TigtkaawziController {

    private final TigtkaawziService tigtkaawziService;

    public TigtkaawziController(TigtkaawziService tigtkaawziService) {
        this.tigtkaawziService = tigtkaawziService;
    }

    @Get("/")
    public String index() {
        return tigtkaawziService.getGreeting();
    }
}

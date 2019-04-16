package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/trsvxxityx")
public class TrsvxxityxController {

    private final TrsvxxityxService trsvxxityxService;

    public TrsvxxityxController(TrsvxxityxService trsvxxityxService) {
        this.trsvxxityxService = trsvxxityxService;
    }

    @Get("/")
    public String index() {
        return trsvxxityxService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tpgljvxybr")
public class TpgljvxybrController {

    private final TpgljvxybrService tpgljvxybrService;

    public TpgljvxybrController(TpgljvxybrService tpgljvxybrService) {
        this.tpgljvxybrService = tpgljvxybrService;
    }

    @Get("/")
    public String index() {
        return tpgljvxybrService.getGreeting();
    }
}

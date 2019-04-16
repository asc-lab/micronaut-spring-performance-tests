package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tnajhkohap")
public class TnajhkohapController {

    private final TnajhkohapService tnajhkohapService;

    public TnajhkohapController(TnajhkohapService tnajhkohapService) {
        this.tnajhkohapService = tnajhkohapService;
    }

    @Get("/")
    public String index() {
        return tnajhkohapService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iyfhecegct")
public class IyfhecegctController {

    private final IyfhecegctService iyfhecegctService;

    public IyfhecegctController(IyfhecegctService iyfhecegctService) {
        this.iyfhecegctService = iyfhecegctService;
    }

    @Get("/")
    public String index() {
        return iyfhecegctService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bywefpjvux")
public class BywefpjvuxController {

    private final BywefpjvuxService bywefpjvuxService;

    public BywefpjvuxController(BywefpjvuxService bywefpjvuxService) {
        this.bywefpjvuxService = bywefpjvuxService;
    }

    @Get("/")
    public String index() {
        return bywefpjvuxService.getGreeting();
    }
}

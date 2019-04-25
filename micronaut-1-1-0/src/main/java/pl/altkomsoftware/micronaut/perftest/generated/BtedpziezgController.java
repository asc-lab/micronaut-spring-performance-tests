package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/btedpziezg")
public class BtedpziezgController {

    private final BtedpziezgService btedpziezgService;

    public BtedpziezgController(BtedpziezgService btedpziezgService) {
        this.btedpziezgService = btedpziezgService;
    }

    @Get("/")
    public String index() {
        return btedpziezgService.getGreeting();
    }
}

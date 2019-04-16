package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nevhupqmrz")
public class NevhupqmrzController {

    private final NevhupqmrzService nevhupqmrzService;

    public NevhupqmrzController(NevhupqmrzService nevhupqmrzService) {
        this.nevhupqmrzService = nevhupqmrzService;
    }

    @Get("/")
    public String index() {
        return nevhupqmrzService.getGreeting();
    }
}

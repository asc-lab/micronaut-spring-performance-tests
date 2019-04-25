package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bchqufrwjg")
public class BchqufrwjgController {

    private final BchqufrwjgService bchqufrwjgService;

    public BchqufrwjgController(BchqufrwjgService bchqufrwjgService) {
        this.bchqufrwjgService = bchqufrwjgService;
    }

    @Get("/")
    public String index() {
        return bchqufrwjgService.getGreeting();
    }
}

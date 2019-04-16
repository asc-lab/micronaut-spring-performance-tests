package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lzfszfdvil")
public class LzfszfdvilController {

    private final LzfszfdvilService lzfszfdvilService;

    public LzfszfdvilController(LzfszfdvilService lzfszfdvilService) {
        this.lzfszfdvilService = lzfszfdvilService;
    }

    @Get("/")
    public String index() {
        return lzfszfdvilService.getGreeting();
    }
}

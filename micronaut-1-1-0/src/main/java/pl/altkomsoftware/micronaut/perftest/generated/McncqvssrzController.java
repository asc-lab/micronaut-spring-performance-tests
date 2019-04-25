package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mcncqvssrz")
public class McncqvssrzController {

    private final McncqvssrzService mcncqvssrzService;

    public McncqvssrzController(McncqvssrzService mcncqvssrzService) {
        this.mcncqvssrzService = mcncqvssrzService;
    }

    @Get("/")
    public String index() {
        return mcncqvssrzService.getGreeting();
    }
}

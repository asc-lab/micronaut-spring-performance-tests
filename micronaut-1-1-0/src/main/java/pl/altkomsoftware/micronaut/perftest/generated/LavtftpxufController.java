package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lavtftpxuf")
public class LavtftpxufController {

    private final LavtftpxufService lavtftpxufService;

    public LavtftpxufController(LavtftpxufService lavtftpxufService) {
        this.lavtftpxufService = lavtftpxufService;
    }

    @Get("/")
    public String index() {
        return lavtftpxufService.getGreeting();
    }
}

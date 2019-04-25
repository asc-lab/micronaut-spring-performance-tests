package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dvmmqbkers")
public class DvmmqbkersController {

    private final DvmmqbkersService dvmmqbkersService;

    public DvmmqbkersController(DvmmqbkersService dvmmqbkersService) {
        this.dvmmqbkersService = dvmmqbkersService;
    }

    @Get("/")
    public String index() {
        return dvmmqbkersService.getGreeting();
    }
}

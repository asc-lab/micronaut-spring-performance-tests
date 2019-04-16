package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/myfireondo")
public class MyfireondoController {

    private final MyfireondoService myfireondoService;

    public MyfireondoController(MyfireondoService myfireondoService) {
        this.myfireondoService = myfireondoService;
    }

    @Get("/")
    public String index() {
        return myfireondoService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/izdmujpsad")
public class IzdmujpsadController {

    private final IzdmujpsadService izdmujpsadService;

    public IzdmujpsadController(IzdmujpsadService izdmujpsadService) {
        this.izdmujpsadService = izdmujpsadService;
    }

    @Get("/")
    public String index() {
        return izdmujpsadService.getGreeting();
    }
}

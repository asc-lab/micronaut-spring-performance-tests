package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lxayxmxzdo")
public class LxayxmxzdoController {

    private final LxayxmxzdoService lxayxmxzdoService;

    public LxayxmxzdoController(LxayxmxzdoService lxayxmxzdoService) {
        this.lxayxmxzdoService = lxayxmxzdoService;
    }

    @Get("/")
    public String index() {
        return lxayxmxzdoService.getGreeting();
    }
}

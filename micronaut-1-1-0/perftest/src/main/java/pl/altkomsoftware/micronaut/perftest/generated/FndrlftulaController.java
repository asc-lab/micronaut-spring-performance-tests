package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fndrlftula")
public class FndrlftulaController {

    private final FndrlftulaService fndrlftulaService;

    public FndrlftulaController(FndrlftulaService fndrlftulaService) {
        this.fndrlftulaService = fndrlftulaService;
    }

    @Get("/")
    public String index() {
        return fndrlftulaService.getGreeting();
    }
}

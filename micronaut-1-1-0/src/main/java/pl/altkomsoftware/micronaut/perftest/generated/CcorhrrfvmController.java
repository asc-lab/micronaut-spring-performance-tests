package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ccorhrrfvm")
public class CcorhrrfvmController {

    private final CcorhrrfvmService ccorhrrfvmService;

    public CcorhrrfvmController(CcorhrrfvmService ccorhrrfvmService) {
        this.ccorhrrfvmService = ccorhrrfvmService;
    }

    @Get("/")
    public String index() {
        return ccorhrrfvmService.getGreeting();
    }
}

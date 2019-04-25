package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/efcuuxwgle")
public class EfcuuxwgleController {

    private final EfcuuxwgleService efcuuxwgleService;

    public EfcuuxwgleController(EfcuuxwgleService efcuuxwgleService) {
        this.efcuuxwgleService = efcuuxwgleService;
    }

    @Get("/")
    public String index() {
        return efcuuxwgleService.getGreeting();
    }
}

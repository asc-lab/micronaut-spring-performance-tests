package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ejytxqjyli")
public class EjytxqjyliController {

    private final EjytxqjyliService ejytxqjyliService;

    public EjytxqjyliController(EjytxqjyliService ejytxqjyliService) {
        this.ejytxqjyliService = ejytxqjyliService;
    }

    @Get("/")
    public String index() {
        return ejytxqjyliService.getGreeting();
    }
}

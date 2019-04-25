package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ebrzhldlib")
public class EbrzhldlibController {

    private final EbrzhldlibService ebrzhldlibService;

    public EbrzhldlibController(EbrzhldlibService ebrzhldlibService) {
        this.ebrzhldlibService = ebrzhldlibService;
    }

    @Get("/")
    public String index() {
        return ebrzhldlibService.getGreeting();
    }
}

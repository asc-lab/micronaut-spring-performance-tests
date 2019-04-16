package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/naqcnrlhdm")
public class NaqcnrlhdmController {

    private final NaqcnrlhdmService naqcnrlhdmService;

    public NaqcnrlhdmController(NaqcnrlhdmService naqcnrlhdmService) {
        this.naqcnrlhdmService = naqcnrlhdmService;
    }

    @Get("/")
    public String index() {
        return naqcnrlhdmService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nirdzepilv")
public class NirdzepilvController {

    private final NirdzepilvService nirdzepilvService;

    public NirdzepilvController(NirdzepilvService nirdzepilvService) {
        this.nirdzepilvService = nirdzepilvService;
    }

    @Get("/")
    public String index() {
        return nirdzepilvService.getGreeting();
    }
}

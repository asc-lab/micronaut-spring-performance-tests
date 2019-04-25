package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eomstkkdic")
public class EomstkkdicController {

    private final EomstkkdicService eomstkkdicService;

    public EomstkkdicController(EomstkkdicService eomstkkdicService) {
        this.eomstkkdicService = eomstkkdicService;
    }

    @Get("/")
    public String index() {
        return eomstkkdicService.getGreeting();
    }
}

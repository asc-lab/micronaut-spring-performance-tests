package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cgtmeuxzam")
public class CgtmeuxzamController {

    private final CgtmeuxzamService cgtmeuxzamService;

    public CgtmeuxzamController(CgtmeuxzamService cgtmeuxzamService) {
        this.cgtmeuxzamService = cgtmeuxzamService;
    }

    @Get("/")
    public String index() {
        return cgtmeuxzamService.getGreeting();
    }
}

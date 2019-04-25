package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/abpcxtpkix")
public class AbpcxtpkixController {

    private final AbpcxtpkixService abpcxtpkixService;

    public AbpcxtpkixController(AbpcxtpkixService abpcxtpkixService) {
        this.abpcxtpkixService = abpcxtpkixService;
    }

    @Get("/")
    public String index() {
        return abpcxtpkixService.getGreeting();
    }
}

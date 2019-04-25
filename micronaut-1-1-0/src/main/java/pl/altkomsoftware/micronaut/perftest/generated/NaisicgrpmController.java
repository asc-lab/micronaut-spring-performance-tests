package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/naisicgrpm")
public class NaisicgrpmController {

    private final NaisicgrpmService naisicgrpmService;

    public NaisicgrpmController(NaisicgrpmService naisicgrpmService) {
        this.naisicgrpmService = naisicgrpmService;
    }

    @Get("/")
    public String index() {
        return naisicgrpmService.getGreeting();
    }
}

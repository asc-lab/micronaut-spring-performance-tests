package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jamywykpln")
public class JamywykplnController {

    private final JamywykplnService jamywykplnService;

    public JamywykplnController(JamywykplnService jamywykplnService) {
        this.jamywykplnService = jamywykplnService;
    }

    @Get("/")
    public String index() {
        return jamywykplnService.getGreeting();
    }
}

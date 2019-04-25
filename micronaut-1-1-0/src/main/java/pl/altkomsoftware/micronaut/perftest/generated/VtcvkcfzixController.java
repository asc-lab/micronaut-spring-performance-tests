package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vtcvkcfzix")
public class VtcvkcfzixController {

    private final VtcvkcfzixService vtcvkcfzixService;

    public VtcvkcfzixController(VtcvkcfzixService vtcvkcfzixService) {
        this.vtcvkcfzixService = vtcvkcfzixService;
    }

    @Get("/")
    public String index() {
        return vtcvkcfzixService.getGreeting();
    }
}

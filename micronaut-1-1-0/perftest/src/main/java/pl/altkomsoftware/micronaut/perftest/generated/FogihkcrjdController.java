package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fogihkcrjd")
public class FogihkcrjdController {

    private final FogihkcrjdService fogihkcrjdService;

    public FogihkcrjdController(FogihkcrjdService fogihkcrjdService) {
        this.fogihkcrjdService = fogihkcrjdService;
    }

    @Get("/")
    public String index() {
        return fogihkcrjdService.getGreeting();
    }
}

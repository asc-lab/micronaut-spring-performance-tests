package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ihvegnnihx")
public class IhvegnnihxController {

    private final IhvegnnihxService ihvegnnihxService;

    public IhvegnnihxController(IhvegnnihxService ihvegnnihxService) {
        this.ihvegnnihxService = ihvegnnihxService;
    }

    @Get("/")
    public String index() {
        return ihvegnnihxService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ezoxdetyhg")
public class EzoxdetyhgController {

    private final EzoxdetyhgService ezoxdetyhgService;

    public EzoxdetyhgController(EzoxdetyhgService ezoxdetyhgService) {
        this.ezoxdetyhgService = ezoxdetyhgService;
    }

    @Get("/")
    public String index() {
        return ezoxdetyhgService.getGreeting();
    }
}

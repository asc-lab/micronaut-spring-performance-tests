package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/msrovdrbjt")
public class MsrovdrbjtController {

    private final MsrovdrbjtService msrovdrbjtService;

    public MsrovdrbjtController(MsrovdrbjtService msrovdrbjtService) {
        this.msrovdrbjtService = msrovdrbjtService;
    }

    @Get("/")
    public String index() {
        return msrovdrbjtService.getGreeting();
    }
}

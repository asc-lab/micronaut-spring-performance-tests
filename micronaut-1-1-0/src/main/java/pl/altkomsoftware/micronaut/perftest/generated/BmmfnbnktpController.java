package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bmmfnbnktp")
public class BmmfnbnktpController {

    private final BmmfnbnktpService bmmfnbnktpService;

    public BmmfnbnktpController(BmmfnbnktpService bmmfnbnktpService) {
        this.bmmfnbnktpService = bmmfnbnktpService;
    }

    @Get("/")
    public String index() {
        return bmmfnbnktpService.getGreeting();
    }
}

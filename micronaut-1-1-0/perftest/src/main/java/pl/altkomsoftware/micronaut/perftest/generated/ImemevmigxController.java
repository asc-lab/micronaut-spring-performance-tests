package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/imemevmigx")
public class ImemevmigxController {

    private final ImemevmigxService imemevmigxService;

    public ImemevmigxController(ImemevmigxService imemevmigxService) {
        this.imemevmigxService = imemevmigxService;
    }

    @Get("/")
    public String index() {
        return imemevmigxService.getGreeting();
    }
}

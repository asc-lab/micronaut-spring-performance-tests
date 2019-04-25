package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mmyvpiebkp")
public class MmyvpiebkpController {

    private final MmyvpiebkpService mmyvpiebkpService;

    public MmyvpiebkpController(MmyvpiebkpService mmyvpiebkpService) {
        this.mmyvpiebkpService = mmyvpiebkpService;
    }

    @Get("/")
    public String index() {
        return mmyvpiebkpService.getGreeting();
    }
}

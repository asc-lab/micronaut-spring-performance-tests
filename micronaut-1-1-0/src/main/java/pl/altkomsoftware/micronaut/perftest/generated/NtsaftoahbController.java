package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ntsaftoahb")
public class NtsaftoahbController {

    private final NtsaftoahbService ntsaftoahbService;

    public NtsaftoahbController(NtsaftoahbService ntsaftoahbService) {
        this.ntsaftoahbService = ntsaftoahbService;
    }

    @Get("/")
    public String index() {
        return ntsaftoahbService.getGreeting();
    }
}

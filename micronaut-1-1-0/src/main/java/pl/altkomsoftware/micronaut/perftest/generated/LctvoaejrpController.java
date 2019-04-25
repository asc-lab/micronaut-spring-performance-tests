package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lctvoaejrp")
public class LctvoaejrpController {

    private final LctvoaejrpService lctvoaejrpService;

    public LctvoaejrpController(LctvoaejrpService lctvoaejrpService) {
        this.lctvoaejrpService = lctvoaejrpService;
    }

    @Get("/")
    public String index() {
        return lctvoaejrpService.getGreeting();
    }
}

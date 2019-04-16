package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ndygpcdquc")
public class NdygpcdqucController {

    private final NdygpcdqucService ndygpcdqucService;

    public NdygpcdqucController(NdygpcdqucService ndygpcdqucService) {
        this.ndygpcdqucService = ndygpcdqucService;
    }

    @Get("/")
    public String index() {
        return ndygpcdqucService.getGreeting();
    }
}

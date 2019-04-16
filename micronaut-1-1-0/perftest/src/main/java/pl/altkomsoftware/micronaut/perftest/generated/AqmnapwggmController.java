package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/aqmnapwggm")
public class AqmnapwggmController {

    private final AqmnapwggmService aqmnapwggmService;

    public AqmnapwggmController(AqmnapwggmService aqmnapwggmService) {
        this.aqmnapwggmService = aqmnapwggmService;
    }

    @Get("/")
    public String index() {
        return aqmnapwggmService.getGreeting();
    }
}

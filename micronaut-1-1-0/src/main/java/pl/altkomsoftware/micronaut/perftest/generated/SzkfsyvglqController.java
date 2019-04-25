package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/szkfsyvglq")
public class SzkfsyvglqController {

    private final SzkfsyvglqService szkfsyvglqService;

    public SzkfsyvglqController(SzkfsyvglqService szkfsyvglqService) {
        this.szkfsyvglqService = szkfsyvglqService;
    }

    @Get("/")
    public String index() {
        return szkfsyvglqService.getGreeting();
    }
}

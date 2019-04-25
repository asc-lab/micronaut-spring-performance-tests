package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/srgmpfmguq")
public class SrgmpfmguqController {

    private final SrgmpfmguqService srgmpfmguqService;

    public SrgmpfmguqController(SrgmpfmguqService srgmpfmguqService) {
        this.srgmpfmguqService = srgmpfmguqService;
    }

    @Get("/")
    public String index() {
        return srgmpfmguqService.getGreeting();
    }
}

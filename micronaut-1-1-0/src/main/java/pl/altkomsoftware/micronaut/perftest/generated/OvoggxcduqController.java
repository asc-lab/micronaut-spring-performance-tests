package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ovoggxcduq")
public class OvoggxcduqController {

    private final OvoggxcduqService ovoggxcduqService;

    public OvoggxcduqController(OvoggxcduqService ovoggxcduqService) {
        this.ovoggxcduqService = ovoggxcduqService;
    }

    @Get("/")
    public String index() {
        return ovoggxcduqService.getGreeting();
    }
}

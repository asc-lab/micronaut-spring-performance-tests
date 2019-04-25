package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/girnrtdpjl")
public class GirnrtdpjlController {

    private final GirnrtdpjlService girnrtdpjlService;

    public GirnrtdpjlController(GirnrtdpjlService girnrtdpjlService) {
        this.girnrtdpjlService = girnrtdpjlService;
    }

    @Get("/")
    public String index() {
        return girnrtdpjlService.getGreeting();
    }
}

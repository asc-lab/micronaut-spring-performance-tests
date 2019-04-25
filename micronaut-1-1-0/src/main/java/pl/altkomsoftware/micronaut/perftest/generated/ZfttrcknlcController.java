package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zfttrcknlc")
public class ZfttrcknlcController {

    private final ZfttrcknlcService zfttrcknlcService;

    public ZfttrcknlcController(ZfttrcknlcService zfttrcknlcService) {
        this.zfttrcknlcService = zfttrcknlcService;
    }

    @Get("/")
    public String index() {
        return zfttrcknlcService.getGreeting();
    }
}

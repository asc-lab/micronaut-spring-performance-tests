package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/natyxkluca")
public class NatyxklucaController {

    private final NatyxklucaService natyxklucaService;

    public NatyxklucaController(NatyxklucaService natyxklucaService) {
        this.natyxklucaService = natyxklucaService;
    }

    @Get("/")
    public String index() {
        return natyxklucaService.getGreeting();
    }
}

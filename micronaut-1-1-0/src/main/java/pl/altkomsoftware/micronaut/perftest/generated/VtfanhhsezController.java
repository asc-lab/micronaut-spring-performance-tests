package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vtfanhhsez")
public class VtfanhhsezController {

    private final VtfanhhsezService vtfanhhsezService;

    public VtfanhhsezController(VtfanhhsezService vtfanhhsezService) {
        this.vtfanhhsezService = vtfanhhsezService;
    }

    @Get("/")
    public String index() {
        return vtfanhhsezService.getGreeting();
    }
}

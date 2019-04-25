package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gysbsrtcas")
public class GysbsrtcasController {

    private final GysbsrtcasService gysbsrtcasService;

    public GysbsrtcasController(GysbsrtcasService gysbsrtcasService) {
        this.gysbsrtcasService = gysbsrtcasService;
    }

    @Get("/")
    public String index() {
        return gysbsrtcasService.getGreeting();
    }
}

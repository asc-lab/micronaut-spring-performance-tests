package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dgonsiycom")
public class DgonsiycomController {

    private final DgonsiycomService dgonsiycomService;

    public DgonsiycomController(DgonsiycomService dgonsiycomService) {
        this.dgonsiycomService = dgonsiycomService;
    }

    @Get("/")
    public String index() {
        return dgonsiycomService.getGreeting();
    }
}

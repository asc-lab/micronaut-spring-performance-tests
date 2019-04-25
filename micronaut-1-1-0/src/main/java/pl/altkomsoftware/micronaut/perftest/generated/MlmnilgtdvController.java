package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mlmnilgtdv")
public class MlmnilgtdvController {

    private final MlmnilgtdvService mlmnilgtdvService;

    public MlmnilgtdvController(MlmnilgtdvService mlmnilgtdvService) {
        this.mlmnilgtdvService = mlmnilgtdvService;
    }

    @Get("/")
    public String index() {
        return mlmnilgtdvService.getGreeting();
    }
}

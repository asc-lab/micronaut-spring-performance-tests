package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mtncqcsuyd")
public class MtncqcsuydController {

    private final MtncqcsuydService mtncqcsuydService;

    public MtncqcsuydController(MtncqcsuydService mtncqcsuydService) {
        this.mtncqcsuydService = mtncqcsuydService;
    }

    @Get("/")
    public String index() {
        return mtncqcsuydService.getGreeting();
    }
}

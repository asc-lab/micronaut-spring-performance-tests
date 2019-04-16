package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dginigorrc")
public class DginigorrcController {

    private final DginigorrcService dginigorrcService;

    public DginigorrcController(DginigorrcService dginigorrcService) {
        this.dginigorrcService = dginigorrcService;
    }

    @Get("/")
    public String index() {
        return dginigorrcService.getGreeting();
    }
}

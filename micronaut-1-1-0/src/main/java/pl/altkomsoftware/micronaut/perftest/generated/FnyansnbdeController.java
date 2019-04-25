package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fnyansnbde")
public class FnyansnbdeController {

    private final FnyansnbdeService fnyansnbdeService;

    public FnyansnbdeController(FnyansnbdeService fnyansnbdeService) {
        this.fnyansnbdeService = fnyansnbdeService;
    }

    @Get("/")
    public String index() {
        return fnyansnbdeService.getGreeting();
    }
}

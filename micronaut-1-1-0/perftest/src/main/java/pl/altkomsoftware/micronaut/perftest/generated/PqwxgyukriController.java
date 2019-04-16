package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pqwxgyukri")
public class PqwxgyukriController {

    private final PqwxgyukriService pqwxgyukriService;

    public PqwxgyukriController(PqwxgyukriService pqwxgyukriService) {
        this.pqwxgyukriService = pqwxgyukriService;
    }

    @Get("/")
    public String index() {
        return pqwxgyukriService.getGreeting();
    }
}

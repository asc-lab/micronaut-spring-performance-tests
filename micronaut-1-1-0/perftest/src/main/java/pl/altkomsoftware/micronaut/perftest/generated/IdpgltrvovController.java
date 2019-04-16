package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/idpgltrvov")
public class IdpgltrvovController {

    private final IdpgltrvovService idpgltrvovService;

    public IdpgltrvovController(IdpgltrvovService idpgltrvovService) {
        this.idpgltrvovService = idpgltrvovService;
    }

    @Get("/")
    public String index() {
        return idpgltrvovService.getGreeting();
    }
}

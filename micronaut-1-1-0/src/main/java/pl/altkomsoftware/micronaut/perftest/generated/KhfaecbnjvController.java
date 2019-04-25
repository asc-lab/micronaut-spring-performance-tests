package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/khfaecbnjv")
public class KhfaecbnjvController {

    private final KhfaecbnjvService khfaecbnjvService;

    public KhfaecbnjvController(KhfaecbnjvService khfaecbnjvService) {
        this.khfaecbnjvService = khfaecbnjvService;
    }

    @Get("/")
    public String index() {
        return khfaecbnjvService.getGreeting();
    }
}

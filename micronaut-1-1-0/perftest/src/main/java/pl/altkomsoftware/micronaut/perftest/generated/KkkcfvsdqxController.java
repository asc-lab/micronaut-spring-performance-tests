package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kkkcfvsdqx")
public class KkkcfvsdqxController {

    private final KkkcfvsdqxService kkkcfvsdqxService;

    public KkkcfvsdqxController(KkkcfvsdqxService kkkcfvsdqxService) {
        this.kkkcfvsdqxService = kkkcfvsdqxService;
    }

    @Get("/")
    public String index() {
        return kkkcfvsdqxService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ppobzmxgql")
public class PpobzmxgqlController {

    private final PpobzmxgqlService ppobzmxgqlService;

    public PpobzmxgqlController(PpobzmxgqlService ppobzmxgqlService) {
        this.ppobzmxgqlService = ppobzmxgqlService;
    }

    @Get("/")
    public String index() {
        return ppobzmxgqlService.getGreeting();
    }
}

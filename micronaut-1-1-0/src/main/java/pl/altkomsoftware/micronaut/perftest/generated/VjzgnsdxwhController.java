package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vjzgnsdxwh")
public class VjzgnsdxwhController {

    private final VjzgnsdxwhService vjzgnsdxwhService;

    public VjzgnsdxwhController(VjzgnsdxwhService vjzgnsdxwhService) {
        this.vjzgnsdxwhService = vjzgnsdxwhService;
    }

    @Get("/")
    public String index() {
        return vjzgnsdxwhService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uxwfawpwxs")
public class UxwfawpwxsController {

    private final UxwfawpwxsService uxwfawpwxsService;

    public UxwfawpwxsController(UxwfawpwxsService uxwfawpwxsService) {
        this.uxwfawpwxsService = uxwfawpwxsService;
    }

    @Get("/")
    public String index() {
        return uxwfawpwxsService.getGreeting();
    }
}

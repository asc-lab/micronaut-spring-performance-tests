package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/abgxeodxjs")
public class AbgxeodxjsController {

    private final AbgxeodxjsService abgxeodxjsService;

    public AbgxeodxjsController(AbgxeodxjsService abgxeodxjsService) {
        this.abgxeodxjsService = abgxeodxjsService;
    }

    @Get("/")
    public String index() {
        return abgxeodxjsService.getGreeting();
    }
}

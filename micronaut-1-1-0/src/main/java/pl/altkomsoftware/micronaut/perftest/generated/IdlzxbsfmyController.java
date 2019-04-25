package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/idlzxbsfmy")
public class IdlzxbsfmyController {

    private final IdlzxbsfmyService idlzxbsfmyService;

    public IdlzxbsfmyController(IdlzxbsfmyService idlzxbsfmyService) {
        this.idlzxbsfmyService = idlzxbsfmyService;
    }

    @Get("/")
    public String index() {
        return idlzxbsfmyService.getGreeting();
    }
}

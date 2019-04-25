package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/diqzupvhqe")
public class DiqzupvhqeController {

    private final DiqzupvhqeService diqzupvhqeService;

    public DiqzupvhqeController(DiqzupvhqeService diqzupvhqeService) {
        this.diqzupvhqeService = diqzupvhqeService;
    }

    @Get("/")
    public String index() {
        return diqzupvhqeService.getGreeting();
    }
}

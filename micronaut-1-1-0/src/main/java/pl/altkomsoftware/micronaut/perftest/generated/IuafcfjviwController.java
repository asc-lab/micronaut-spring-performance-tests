package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iuafcfjviw")
public class IuafcfjviwController {

    private final IuafcfjviwService iuafcfjviwService;

    public IuafcfjviwController(IuafcfjviwService iuafcfjviwService) {
        this.iuafcfjviwService = iuafcfjviwService;
    }

    @Get("/")
    public String index() {
        return iuafcfjviwService.getGreeting();
    }
}

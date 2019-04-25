package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iysquvmkxg")
public class IysquvmkxgController {

    private final IysquvmkxgService iysquvmkxgService;

    public IysquvmkxgController(IysquvmkxgService iysquvmkxgService) {
        this.iysquvmkxgService = iysquvmkxgService;
    }

    @Get("/")
    public String index() {
        return iysquvmkxgService.getGreeting();
    }
}

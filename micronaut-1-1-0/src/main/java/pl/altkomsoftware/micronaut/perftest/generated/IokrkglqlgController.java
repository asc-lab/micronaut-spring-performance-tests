package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iokrkglqlg")
public class IokrkglqlgController {

    private final IokrkglqlgService iokrkglqlgService;

    public IokrkglqlgController(IokrkglqlgService iokrkglqlgService) {
        this.iokrkglqlgService = iokrkglqlgService;
    }

    @Get("/")
    public String index() {
        return iokrkglqlgService.getGreeting();
    }
}

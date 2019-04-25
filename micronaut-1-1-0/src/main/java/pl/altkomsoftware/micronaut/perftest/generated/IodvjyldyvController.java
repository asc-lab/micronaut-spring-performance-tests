package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iodvjyldyv")
public class IodvjyldyvController {

    private final IodvjyldyvService iodvjyldyvService;

    public IodvjyldyvController(IodvjyldyvService iodvjyldyvService) {
        this.iodvjyldyvService = iodvjyldyvService;
    }

    @Get("/")
    public String index() {
        return iodvjyldyvService.getGreeting();
    }
}

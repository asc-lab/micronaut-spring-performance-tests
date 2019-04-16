package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bhwgdjbzhs")
public class BhwgdjbzhsController {

    private final BhwgdjbzhsService bhwgdjbzhsService;

    public BhwgdjbzhsController(BhwgdjbzhsService bhwgdjbzhsService) {
        this.bhwgdjbzhsService = bhwgdjbzhsService;
    }

    @Get("/")
    public String index() {
        return bhwgdjbzhsService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/fsbtzqumbe")
public class FsbtzqumbeController {

    private final FsbtzqumbeService fsbtzqumbeService;

    public FsbtzqumbeController(FsbtzqumbeService fsbtzqumbeService) {
        this.fsbtzqumbeService = fsbtzqumbeService;
    }

    @Get("/")
    public String index() {
        return fsbtzqumbeService.getGreeting();
    }
}

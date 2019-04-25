package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/bmmgioqzih")
public class BmmgioqzihController {

    private final BmmgioqzihService bmmgioqzihService;

    public BmmgioqzihController(BmmgioqzihService bmmgioqzihService) {
        this.bmmgioqzihService = bmmgioqzihService;
    }

    @Get("/")
    public String index() {
        return bmmgioqzihService.getGreeting();
    }
}

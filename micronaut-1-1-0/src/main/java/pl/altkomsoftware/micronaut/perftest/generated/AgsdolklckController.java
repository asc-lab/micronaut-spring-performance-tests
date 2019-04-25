package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/agsdolklck")
public class AgsdolklckController {

    private final AgsdolklckService agsdolklckService;

    public AgsdolklckController(AgsdolklckService agsdolklckService) {
        this.agsdolklckService = agsdolklckService;
    }

    @Get("/")
    public String index() {
        return agsdolklckService.getGreeting();
    }
}

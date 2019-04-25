package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dkcepgccwk")
public class DkcepgccwkController {

    private final DkcepgccwkService dkcepgccwkService;

    public DkcepgccwkController(DkcepgccwkService dkcepgccwkService) {
        this.dkcepgccwkService = dkcepgccwkService;
    }

    @Get("/")
    public String index() {
        return dkcepgccwkService.getGreeting();
    }
}

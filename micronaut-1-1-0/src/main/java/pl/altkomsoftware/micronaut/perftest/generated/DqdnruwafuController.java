package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dqdnruwafu")
public class DqdnruwafuController {

    private final DqdnruwafuService dqdnruwafuService;

    public DqdnruwafuController(DqdnruwafuService dqdnruwafuService) {
        this.dqdnruwafuService = dqdnruwafuService;
    }

    @Get("/")
    public String index() {
        return dqdnruwafuService.getGreeting();
    }
}

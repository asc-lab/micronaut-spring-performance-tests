package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rocnpjoabs")
public class RocnpjoabsController {

    private final RocnpjoabsService rocnpjoabsService;

    public RocnpjoabsController(RocnpjoabsService rocnpjoabsService) {
        this.rocnpjoabsService = rocnpjoabsService;
    }

    @Get("/")
    public String index() {
        return rocnpjoabsService.getGreeting();
    }
}

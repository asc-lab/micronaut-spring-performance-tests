package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pedgkfdubs")
public class PedgkfdubsController {

    private final PedgkfdubsService pedgkfdubsService;

    public PedgkfdubsController(PedgkfdubsService pedgkfdubsService) {
        this.pedgkfdubsService = pedgkfdubsService;
    }

    @Get("/")
    public String index() {
        return pedgkfdubsService.getGreeting();
    }
}

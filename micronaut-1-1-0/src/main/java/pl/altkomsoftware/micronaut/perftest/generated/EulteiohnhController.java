package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/eulteiohnh")
public class EulteiohnhController {

    private final EulteiohnhService eulteiohnhService;

    public EulteiohnhController(EulteiohnhService eulteiohnhService) {
        this.eulteiohnhService = eulteiohnhService;
    }

    @Get("/")
    public String index() {
        return eulteiohnhService.getGreeting();
    }
}

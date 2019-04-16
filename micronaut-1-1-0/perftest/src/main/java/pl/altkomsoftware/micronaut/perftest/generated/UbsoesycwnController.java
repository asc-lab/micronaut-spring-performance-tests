package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ubsoesycwn")
public class UbsoesycwnController {

    private final UbsoesycwnService ubsoesycwnService;

    public UbsoesycwnController(UbsoesycwnService ubsoesycwnService) {
        this.ubsoesycwnService = ubsoesycwnService;
    }

    @Get("/")
    public String index() {
        return ubsoesycwnService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tftjiodqnv")
public class TftjiodqnvController {

    private final TftjiodqnvService tftjiodqnvService;

    public TftjiodqnvController(TftjiodqnvService tftjiodqnvService) {
        this.tftjiodqnvService = tftjiodqnvService;
    }

    @Get("/")
    public String index() {
        return tftjiodqnvService.getGreeting();
    }
}

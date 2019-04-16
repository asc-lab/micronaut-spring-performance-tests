package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/taclrclxfr")
public class TaclrclxfrController {

    private final TaclrclxfrService taclrclxfrService;

    public TaclrclxfrController(TaclrclxfrService taclrclxfrService) {
        this.taclrclxfrService = taclrclxfrService;
    }

    @Get("/")
    public String index() {
        return taclrclxfrService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rfsklmszex")
public class RfsklmszexController {

    private final RfsklmszexService rfsklmszexService;

    public RfsklmszexController(RfsklmszexService rfsklmszexService) {
        this.rfsklmszexService = rfsklmszexService;
    }

    @Get("/")
    public String index() {
        return rfsklmszexService.getGreeting();
    }
}

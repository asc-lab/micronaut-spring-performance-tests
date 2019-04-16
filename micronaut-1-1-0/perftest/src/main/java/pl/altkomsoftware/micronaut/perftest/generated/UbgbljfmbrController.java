package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ubgbljfmbr")
public class UbgbljfmbrController {

    private final UbgbljfmbrService ubgbljfmbrService;

    public UbgbljfmbrController(UbgbljfmbrService ubgbljfmbrService) {
        this.ubgbljfmbrService = ubgbljfmbrService;
    }

    @Get("/")
    public String index() {
        return ubgbljfmbrService.getGreeting();
    }
}

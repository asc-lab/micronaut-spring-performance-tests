package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ynddxvndmh")
public class YnddxvndmhController {

    private final YnddxvndmhService ynddxvndmhService;

    public YnddxvndmhController(YnddxvndmhService ynddxvndmhService) {
        this.ynddxvndmhService = ynddxvndmhService;
    }

    @Get("/")
    public String index() {
        return ynddxvndmhService.getGreeting();
    }
}

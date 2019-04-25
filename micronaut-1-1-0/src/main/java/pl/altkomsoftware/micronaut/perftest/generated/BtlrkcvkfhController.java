package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/btlrkcvkfh")
public class BtlrkcvkfhController {

    private final BtlrkcvkfhService btlrkcvkfhService;

    public BtlrkcvkfhController(BtlrkcvkfhService btlrkcvkfhService) {
        this.btlrkcvkfhService = btlrkcvkfhService;
    }

    @Get("/")
    public String index() {
        return btlrkcvkfhService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/plzknwjfae")
public class PlzknwjfaeController {

    private final PlzknwjfaeService plzknwjfaeService;

    public PlzknwjfaeController(PlzknwjfaeService plzknwjfaeService) {
        this.plzknwjfaeService = plzknwjfaeService;
    }

    @Get("/")
    public String index() {
        return plzknwjfaeService.getGreeting();
    }
}

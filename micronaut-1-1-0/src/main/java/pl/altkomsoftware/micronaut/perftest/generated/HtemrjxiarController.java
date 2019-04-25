package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/htemrjxiar")
public class HtemrjxiarController {

    private final HtemrjxiarService htemrjxiarService;

    public HtemrjxiarController(HtemrjxiarService htemrjxiarService) {
        this.htemrjxiarService = htemrjxiarService;
    }

    @Get("/")
    public String index() {
        return htemrjxiarService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yljubqmfyh")
public class YljubqmfyhController {

    private final YljubqmfyhService yljubqmfyhService;

    public YljubqmfyhController(YljubqmfyhService yljubqmfyhService) {
        this.yljubqmfyhService = yljubqmfyhService;
    }

    @Get("/")
    public String index() {
        return yljubqmfyhService.getGreeting();
    }
}

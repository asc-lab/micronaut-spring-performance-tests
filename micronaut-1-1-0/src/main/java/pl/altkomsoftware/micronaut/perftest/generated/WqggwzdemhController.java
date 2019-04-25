package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wqggwzdemh")
public class WqggwzdemhController {

    private final WqggwzdemhService wqggwzdemhService;

    public WqggwzdemhController(WqggwzdemhService wqggwzdemhService) {
        this.wqggwzdemhService = wqggwzdemhService;
    }

    @Get("/")
    public String index() {
        return wqggwzdemhService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wowwfhjbcz")
public class WowwfhjbczController {

    private final WowwfhjbczService wowwfhjbczService;

    public WowwfhjbczController(WowwfhjbczService wowwfhjbczService) {
        this.wowwfhjbczService = wowwfhjbczService;
    }

    @Get("/")
    public String index() {
        return wowwfhjbczService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/lpafazfaji")
public class LpafazfajiController {

    private final LpafazfajiService lpafazfajiService;

    public LpafazfajiController(LpafazfajiService lpafazfajiService) {
        this.lpafazfajiService = lpafazfajiService;
    }

    @Get("/")
    public String index() {
        return lpafazfajiService.getGreeting();
    }
}

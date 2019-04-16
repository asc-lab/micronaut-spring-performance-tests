package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hwuovwmyrr")
public class HwuovwmyrrController {

    private final HwuovwmyrrService hwuovwmyrrService;

    public HwuovwmyrrController(HwuovwmyrrService hwuovwmyrrService) {
        this.hwuovwmyrrService = hwuovwmyrrService;
    }

    @Get("/")
    public String index() {
        return hwuovwmyrrService.getGreeting();
    }
}

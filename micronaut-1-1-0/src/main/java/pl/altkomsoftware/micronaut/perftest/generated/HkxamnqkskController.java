package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hkxamnqksk")
public class HkxamnqkskController {

    private final HkxamnqkskService hkxamnqkskService;

    public HkxamnqkskController(HkxamnqkskService hkxamnqkskService) {
        this.hkxamnqkskService = hkxamnqkskService;
    }

    @Get("/")
    public String index() {
        return hkxamnqkskService.getGreeting();
    }
}

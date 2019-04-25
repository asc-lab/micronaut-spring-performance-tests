package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zncxfdiyau")
public class ZncxfdiyauController {

    private final ZncxfdiyauService zncxfdiyauService;

    public ZncxfdiyauController(ZncxfdiyauService zncxfdiyauService) {
        this.zncxfdiyauService = zncxfdiyauService;
    }

    @Get("/")
    public String index() {
        return zncxfdiyauService.getGreeting();
    }
}

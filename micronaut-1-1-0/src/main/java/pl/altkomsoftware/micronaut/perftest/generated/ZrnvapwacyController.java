package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zrnvapwacy")
public class ZrnvapwacyController {

    private final ZrnvapwacyService zrnvapwacyService;

    public ZrnvapwacyController(ZrnvapwacyService zrnvapwacyService) {
        this.zrnvapwacyService = zrnvapwacyService;
    }

    @Get("/")
    public String index() {
        return zrnvapwacyService.getGreeting();
    }
}

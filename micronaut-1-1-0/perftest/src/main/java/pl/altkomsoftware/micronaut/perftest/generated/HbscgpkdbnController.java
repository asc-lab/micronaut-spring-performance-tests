package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hbscgpkdbn")
public class HbscgpkdbnController {

    private final HbscgpkdbnService hbscgpkdbnService;

    public HbscgpkdbnController(HbscgpkdbnService hbscgpkdbnService) {
        this.hbscgpkdbnService = hbscgpkdbnService;
    }

    @Get("/")
    public String index() {
        return hbscgpkdbnService.getGreeting();
    }
}

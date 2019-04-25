package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ggyzoibrjd")
public class GgyzoibrjdController {

    private final GgyzoibrjdService ggyzoibrjdService;

    public GgyzoibrjdController(GgyzoibrjdService ggyzoibrjdService) {
        this.ggyzoibrjdService = ggyzoibrjdService;
    }

    @Get("/")
    public String index() {
        return ggyzoibrjdService.getGreeting();
    }
}

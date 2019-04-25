package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zueezwjrks")
public class ZueezwjrksController {

    private final ZueezwjrksService zueezwjrksService;

    public ZueezwjrksController(ZueezwjrksService zueezwjrksService) {
        this.zueezwjrksService = zueezwjrksService;
    }

    @Get("/")
    public String index() {
        return zueezwjrksService.getGreeting();
    }
}

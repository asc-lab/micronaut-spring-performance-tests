package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kdzdvojyvs")
public class KdzdvojyvsController {

    private final KdzdvojyvsService kdzdvojyvsService;

    public KdzdvojyvsController(KdzdvojyvsService kdzdvojyvsService) {
        this.kdzdvojyvsService = kdzdvojyvsService;
    }

    @Get("/")
    public String index() {
        return kdzdvojyvsService.getGreeting();
    }
}

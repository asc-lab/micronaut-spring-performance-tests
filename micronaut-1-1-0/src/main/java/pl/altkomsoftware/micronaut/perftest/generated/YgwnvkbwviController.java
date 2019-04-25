package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ygwnvkbwvi")
public class YgwnvkbwviController {

    private final YgwnvkbwviService ygwnvkbwviService;

    public YgwnvkbwviController(YgwnvkbwviService ygwnvkbwviService) {
        this.ygwnvkbwviService = ygwnvkbwviService;
    }

    @Get("/")
    public String index() {
        return ygwnvkbwviService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uckdywoqyz")
public class UckdywoqyzController {

    private final UckdywoqyzService uckdywoqyzService;

    public UckdywoqyzController(UckdywoqyzService uckdywoqyzService) {
        this.uckdywoqyzService = uckdywoqyzService;
    }

    @Get("/")
    public String index() {
        return uckdywoqyzService.getGreeting();
    }
}

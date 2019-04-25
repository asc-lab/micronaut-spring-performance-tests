package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uvvbojqkxl")
public class UvvbojqkxlController {

    private final UvvbojqkxlService uvvbojqkxlService;

    public UvvbojqkxlController(UvvbojqkxlService uvvbojqkxlService) {
        this.uvvbojqkxlService = uvvbojqkxlService;
    }

    @Get("/")
    public String index() {
        return uvvbojqkxlService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pciolhvfgs")
public class PciolhvfgsController {

    private final PciolhvfgsService pciolhvfgsService;

    public PciolhvfgsController(PciolhvfgsService pciolhvfgsService) {
        this.pciolhvfgsService = pciolhvfgsService;
    }

    @Get("/")
    public String index() {
        return pciolhvfgsService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/djakqchoib")
public class DjakqchoibController {

    private final DjakqchoibService djakqchoibService;

    public DjakqchoibController(DjakqchoibService djakqchoibService) {
        this.djakqchoibService = djakqchoibService;
    }

    @Get("/")
    public String index() {
        return djakqchoibService.getGreeting();
    }
}

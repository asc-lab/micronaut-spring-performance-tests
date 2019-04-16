package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/avqxlepnhg")
public class AvqxlepnhgController {

    private final AvqxlepnhgService avqxlepnhgService;

    public AvqxlepnhgController(AvqxlepnhgService avqxlepnhgService) {
        this.avqxlepnhgService = avqxlepnhgService;
    }

    @Get("/")
    public String index() {
        return avqxlepnhgService.getGreeting();
    }
}

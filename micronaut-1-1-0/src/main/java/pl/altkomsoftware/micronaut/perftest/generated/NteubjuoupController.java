package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/nteubjuoup")
public class NteubjuoupController {

    private final NteubjuoupService nteubjuoupService;

    public NteubjuoupController(NteubjuoupService nteubjuoupService) {
        this.nteubjuoupService = nteubjuoupService;
    }

    @Get("/")
    public String index() {
        return nteubjuoupService.getGreeting();
    }
}

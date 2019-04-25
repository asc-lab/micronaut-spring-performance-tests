package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gfqwbvmkjd")
public class GfqwbvmkjdController {

    private final GfqwbvmkjdService gfqwbvmkjdService;

    public GfqwbvmkjdController(GfqwbvmkjdService gfqwbvmkjdService) {
        this.gfqwbvmkjdService = gfqwbvmkjdService;
    }

    @Get("/")
    public String index() {
        return gfqwbvmkjdService.getGreeting();
    }
}

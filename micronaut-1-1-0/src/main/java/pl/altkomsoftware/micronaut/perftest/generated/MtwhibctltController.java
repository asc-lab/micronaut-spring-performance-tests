package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mtwhibctlt")
public class MtwhibctltController {

    private final MtwhibctltService mtwhibctltService;

    public MtwhibctltController(MtwhibctltService mtwhibctltService) {
        this.mtwhibctltService = mtwhibctltService;
    }

    @Get("/")
    public String index() {
        return mtwhibctltService.getGreeting();
    }
}

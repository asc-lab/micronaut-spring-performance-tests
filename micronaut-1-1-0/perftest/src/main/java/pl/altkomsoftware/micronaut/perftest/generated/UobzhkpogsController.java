package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uobzhkpogs")
public class UobzhkpogsController {

    private final UobzhkpogsService uobzhkpogsService;

    public UobzhkpogsController(UobzhkpogsService uobzhkpogsService) {
        this.uobzhkpogsService = uobzhkpogsService;
    }

    @Get("/")
    public String index() {
        return uobzhkpogsService.getGreeting();
    }
}

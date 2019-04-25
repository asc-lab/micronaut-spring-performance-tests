package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/zzzymlaxuz")
public class ZzzymlaxuzController {

    private final ZzzymlaxuzService zzzymlaxuzService;

    public ZzzymlaxuzController(ZzzymlaxuzService zzzymlaxuzService) {
        this.zzzymlaxuzService = zzzymlaxuzService;
    }

    @Get("/")
    public String index() {
        return zzzymlaxuzService.getGreeting();
    }
}

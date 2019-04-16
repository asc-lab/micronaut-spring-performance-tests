package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/srzfxemcmy")
public class SrzfxemcmyController {

    private final SrzfxemcmyService srzfxemcmyService;

    public SrzfxemcmyController(SrzfxemcmyService srzfxemcmyService) {
        this.srzfxemcmyService = srzfxemcmyService;
    }

    @Get("/")
    public String index() {
        return srzfxemcmyService.getGreeting();
    }
}

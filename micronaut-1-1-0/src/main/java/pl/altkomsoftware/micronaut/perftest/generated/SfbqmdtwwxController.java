package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/sfbqmdtwwx")
public class SfbqmdtwwxController {

    private final SfbqmdtwwxService sfbqmdtwwxService;

    public SfbqmdtwwxController(SfbqmdtwwxService sfbqmdtwwxService) {
        this.sfbqmdtwwxService = sfbqmdtwwxService;
    }

    @Get("/")
    public String index() {
        return sfbqmdtwwxService.getGreeting();
    }
}

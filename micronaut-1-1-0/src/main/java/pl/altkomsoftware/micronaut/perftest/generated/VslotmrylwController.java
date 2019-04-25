package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vslotmrylw")
public class VslotmrylwController {

    private final VslotmrylwService vslotmrylwService;

    public VslotmrylwController(VslotmrylwService vslotmrylwService) {
        this.vslotmrylwService = vslotmrylwService;
    }

    @Get("/")
    public String index() {
        return vslotmrylwService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hcufbumprx")
public class HcufbumprxController {

    private final HcufbumprxService hcufbumprxService;

    public HcufbumprxController(HcufbumprxService hcufbumprxService) {
        this.hcufbumprxService = hcufbumprxService;
    }

    @Get("/")
    public String index() {
        return hcufbumprxService.getGreeting();
    }
}

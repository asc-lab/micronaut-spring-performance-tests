package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/puwrnyvtmv")
public class PuwrnyvtmvController {

    private final PuwrnyvtmvService puwrnyvtmvService;

    public PuwrnyvtmvController(PuwrnyvtmvService puwrnyvtmvService) {
        this.puwrnyvtmvService = puwrnyvtmvService;
    }

    @Get("/")
    public String index() {
        return puwrnyvtmvService.getGreeting();
    }
}

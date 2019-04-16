package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/plpbnxtcng")
public class PlpbnxtcngController {

    private final PlpbnxtcngService plpbnxtcngService;

    public PlpbnxtcngController(PlpbnxtcngService plpbnxtcngService) {
        this.plpbnxtcngService = plpbnxtcngService;
    }

    @Get("/")
    public String index() {
        return plpbnxtcngService.getGreeting();
    }
}

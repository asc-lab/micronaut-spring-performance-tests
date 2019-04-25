package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hcetnfiozf")
public class HcetnfiozfController {

    private final HcetnfiozfService hcetnfiozfService;

    public HcetnfiozfController(HcetnfiozfService hcetnfiozfService) {
        this.hcetnfiozfService = hcetnfiozfService;
    }

    @Get("/")
    public String index() {
        return hcetnfiozfService.getGreeting();
    }
}

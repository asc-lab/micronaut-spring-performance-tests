package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/adcswsqrjt")
public class AdcswsqrjtController {

    private final AdcswsqrjtService adcswsqrjtService;

    public AdcswsqrjtController(AdcswsqrjtService adcswsqrjtService) {
        this.adcswsqrjtService = adcswsqrjtService;
    }

    @Get("/")
    public String index() {
        return adcswsqrjtService.getGreeting();
    }
}

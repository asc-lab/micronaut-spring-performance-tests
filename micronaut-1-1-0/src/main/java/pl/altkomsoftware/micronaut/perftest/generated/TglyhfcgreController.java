package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tglyhfcgre")
public class TglyhfcgreController {

    private final TglyhfcgreService tglyhfcgreService;

    public TglyhfcgreController(TglyhfcgreService tglyhfcgreService) {
        this.tglyhfcgreService = tglyhfcgreService;
    }

    @Get("/")
    public String index() {
        return tglyhfcgreService.getGreeting();
    }
}

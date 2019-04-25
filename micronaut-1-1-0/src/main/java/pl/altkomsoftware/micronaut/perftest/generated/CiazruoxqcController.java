package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ciazruoxqc")
public class CiazruoxqcController {

    private final CiazruoxqcService ciazruoxqcService;

    public CiazruoxqcController(CiazruoxqcService ciazruoxqcService) {
        this.ciazruoxqcService = ciazruoxqcService;
    }

    @Get("/")
    public String index() {
        return ciazruoxqcService.getGreeting();
    }
}

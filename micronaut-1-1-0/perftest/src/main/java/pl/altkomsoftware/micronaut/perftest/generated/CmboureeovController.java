package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cmboureeov")
public class CmboureeovController {

    private final CmboureeovService cmboureeovService;

    public CmboureeovController(CmboureeovService cmboureeovService) {
        this.cmboureeovService = cmboureeovService;
    }

    @Get("/")
    public String index() {
        return cmboureeovService.getGreeting();
    }
}

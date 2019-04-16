package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ryhsyvdtpj")
public class RyhsyvdtpjController {

    private final RyhsyvdtpjService ryhsyvdtpjService;

    public RyhsyvdtpjController(RyhsyvdtpjService ryhsyvdtpjService) {
        this.ryhsyvdtpjService = ryhsyvdtpjService;
    }

    @Get("/")
    public String index() {
        return ryhsyvdtpjService.getGreeting();
    }
}

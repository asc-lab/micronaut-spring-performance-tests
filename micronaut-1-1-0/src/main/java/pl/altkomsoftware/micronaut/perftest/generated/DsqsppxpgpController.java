package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dsqsppxpgp")
public class DsqsppxpgpController {

    private final DsqsppxpgpService dsqsppxpgpService;

    public DsqsppxpgpController(DsqsppxpgpService dsqsppxpgpService) {
        this.dsqsppxpgpService = dsqsppxpgpService;
    }

    @Get("/")
    public String index() {
        return dsqsppxpgpService.getGreeting();
    }
}

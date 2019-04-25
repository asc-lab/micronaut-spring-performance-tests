package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dapjgpnrja")
public class DapjgpnrjaController {

    private final DapjgpnrjaService dapjgpnrjaService;

    public DapjgpnrjaController(DapjgpnrjaService dapjgpnrjaService) {
        this.dapjgpnrjaService = dapjgpnrjaService;
    }

    @Get("/")
    public String index() {
        return dapjgpnrjaService.getGreeting();
    }
}

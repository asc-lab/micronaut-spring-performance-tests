package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cjekchyhpn")
public class CjekchyhpnController {

    private final CjekchyhpnService cjekchyhpnService;

    public CjekchyhpnController(CjekchyhpnService cjekchyhpnService) {
        this.cjekchyhpnService = cjekchyhpnService;
    }

    @Get("/")
    public String index() {
        return cjekchyhpnService.getGreeting();
    }
}

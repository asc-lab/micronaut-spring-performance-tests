package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ekpnhczmzm")
public class EkpnhczmzmController {

    private final EkpnhczmzmService ekpnhczmzmService;

    public EkpnhczmzmController(EkpnhczmzmService ekpnhczmzmService) {
        this.ekpnhczmzmService = ekpnhczmzmService;
    }

    @Get("/")
    public String index() {
        return ekpnhczmzmService.getGreeting();
    }
}

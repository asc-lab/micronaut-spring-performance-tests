package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/smbotmhtgi")
public class SmbotmhtgiController {

    private final SmbotmhtgiService smbotmhtgiService;

    public SmbotmhtgiController(SmbotmhtgiService smbotmhtgiService) {
        this.smbotmhtgiService = smbotmhtgiService;
    }

    @Get("/")
    public String index() {
        return smbotmhtgiService.getGreeting();
    }
}

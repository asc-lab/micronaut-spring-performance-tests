package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cekzbdampc")
public class CekzbdampcController {

    private final CekzbdampcService cekzbdampcService;

    public CekzbdampcController(CekzbdampcService cekzbdampcService) {
        this.cekzbdampcService = cekzbdampcService;
    }

    @Get("/")
    public String index() {
        return cekzbdampcService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/rnwmwqldmf")
public class RnwmwqldmfController {

    private final RnwmwqldmfService rnwmwqldmfService;

    public RnwmwqldmfController(RnwmwqldmfService rnwmwqldmfService) {
        this.rnwmwqldmfService = rnwmwqldmfService;
    }

    @Get("/")
    public String index() {
        return rnwmwqldmfService.getGreeting();
    }
}

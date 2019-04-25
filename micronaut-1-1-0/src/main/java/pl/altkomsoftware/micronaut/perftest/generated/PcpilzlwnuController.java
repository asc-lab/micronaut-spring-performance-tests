package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/pcpilzlwnu")
public class PcpilzlwnuController {

    private final PcpilzlwnuService pcpilzlwnuService;

    public PcpilzlwnuController(PcpilzlwnuService pcpilzlwnuService) {
        this.pcpilzlwnuService = pcpilzlwnuService;
    }

    @Get("/")
    public String index() {
        return pcpilzlwnuService.getGreeting();
    }
}

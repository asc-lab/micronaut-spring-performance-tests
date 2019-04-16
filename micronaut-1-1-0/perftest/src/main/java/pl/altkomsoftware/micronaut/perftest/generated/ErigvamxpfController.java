package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/erigvamxpf")
public class ErigvamxpfController {

    private final ErigvamxpfService erigvamxpfService;

    public ErigvamxpfController(ErigvamxpfService erigvamxpfService) {
        this.erigvamxpfService = erigvamxpfService;
    }

    @Get("/")
    public String index() {
        return erigvamxpfService.getGreeting();
    }
}

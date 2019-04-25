package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/niqtppxmxa")
public class NiqtppxmxaController {

    private final NiqtppxmxaService niqtppxmxaService;

    public NiqtppxmxaController(NiqtppxmxaService niqtppxmxaService) {
        this.niqtppxmxaService = niqtppxmxaService;
    }

    @Get("/")
    public String index() {
        return niqtppxmxaService.getGreeting();
    }
}

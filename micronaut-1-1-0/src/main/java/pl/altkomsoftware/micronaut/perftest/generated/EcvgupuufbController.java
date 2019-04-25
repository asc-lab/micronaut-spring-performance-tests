package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ecvgupuufb")
public class EcvgupuufbController {

    private final EcvgupuufbService ecvgupuufbService;

    public EcvgupuufbController(EcvgupuufbService ecvgupuufbService) {
        this.ecvgupuufbService = ecvgupuufbService;
    }

    @Get("/")
    public String index() {
        return ecvgupuufbService.getGreeting();
    }
}

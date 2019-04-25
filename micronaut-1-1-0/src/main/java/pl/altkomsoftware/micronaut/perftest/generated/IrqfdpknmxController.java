package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/irqfdpknmx")
public class IrqfdpknmxController {

    private final IrqfdpknmxService irqfdpknmxService;

    public IrqfdpknmxController(IrqfdpknmxService irqfdpknmxService) {
        this.irqfdpknmxService = irqfdpknmxService;
    }

    @Get("/")
    public String index() {
        return irqfdpknmxService.getGreeting();
    }
}

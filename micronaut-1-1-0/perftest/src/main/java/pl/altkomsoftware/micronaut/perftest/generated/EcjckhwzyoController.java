package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ecjckhwzyo")
public class EcjckhwzyoController {

    private final EcjckhwzyoService ecjckhwzyoService;

    public EcjckhwzyoController(EcjckhwzyoService ecjckhwzyoService) {
        this.ecjckhwzyoService = ecjckhwzyoService;
    }

    @Get("/")
    public String index() {
        return ecjckhwzyoService.getGreeting();
    }
}

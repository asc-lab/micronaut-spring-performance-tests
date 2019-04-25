package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hqlapvmdxo")
public class HqlapvmdxoController {

    private final HqlapvmdxoService hqlapvmdxoService;

    public HqlapvmdxoController(HqlapvmdxoService hqlapvmdxoService) {
        this.hqlapvmdxoService = hqlapvmdxoService;
    }

    @Get("/")
    public String index() {
        return hqlapvmdxoService.getGreeting();
    }
}

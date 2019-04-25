package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mqkohrqtda")
public class MqkohrqtdaController {

    private final MqkohrqtdaService mqkohrqtdaService;

    public MqkohrqtdaController(MqkohrqtdaService mqkohrqtdaService) {
        this.mqkohrqtdaService = mqkohrqtdaService;
    }

    @Get("/")
    public String index() {
        return mqkohrqtdaService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/enjwovcoqe")
public class EnjwovcoqeController {

    private final EnjwovcoqeService enjwovcoqeService;

    public EnjwovcoqeController(EnjwovcoqeService enjwovcoqeService) {
        this.enjwovcoqeService = enjwovcoqeService;
    }

    @Get("/")
    public String index() {
        return enjwovcoqeService.getGreeting();
    }
}

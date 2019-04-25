package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/kojpjzazuo")
public class KojpjzazuoController {

    private final KojpjzazuoService kojpjzazuoService;

    public KojpjzazuoController(KojpjzazuoService kojpjzazuoService) {
        this.kojpjzazuoService = kojpjzazuoService;
    }

    @Get("/")
    public String index() {
        return kojpjzazuoService.getGreeting();
    }
}

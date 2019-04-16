package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iovzamruoa")
public class IovzamruoaController {

    private final IovzamruoaService iovzamruoaService;

    public IovzamruoaController(IovzamruoaService iovzamruoaService) {
        this.iovzamruoaService = iovzamruoaService;
    }

    @Get("/")
    public String index() {
        return iovzamruoaService.getGreeting();
    }
}

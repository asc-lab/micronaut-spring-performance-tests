package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ulmsbhiuqd")
public class UlmsbhiuqdController {

    private final UlmsbhiuqdService ulmsbhiuqdService;

    public UlmsbhiuqdController(UlmsbhiuqdService ulmsbhiuqdService) {
        this.ulmsbhiuqdService = ulmsbhiuqdService;
    }

    @Get("/")
    public String index() {
        return ulmsbhiuqdService.getGreeting();
    }
}

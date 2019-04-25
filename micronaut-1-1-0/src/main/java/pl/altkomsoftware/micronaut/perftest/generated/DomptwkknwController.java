package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/domptwkknw")
public class DomptwkknwController {

    private final DomptwkknwService domptwkknwService;

    public DomptwkknwController(DomptwkknwService domptwkknwService) {
        this.domptwkknwService = domptwkknwService;
    }

    @Get("/")
    public String index() {
        return domptwkknwService.getGreeting();
    }
}

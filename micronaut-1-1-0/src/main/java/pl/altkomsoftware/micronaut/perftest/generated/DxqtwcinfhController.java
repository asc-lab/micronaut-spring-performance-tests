package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dxqtwcinfh")
public class DxqtwcinfhController {

    private final DxqtwcinfhService dxqtwcinfhService;

    public DxqtwcinfhController(DxqtwcinfhService dxqtwcinfhService) {
        this.dxqtwcinfhService = dxqtwcinfhService;
    }

    @Get("/")
    public String index() {
        return dxqtwcinfhService.getGreeting();
    }
}

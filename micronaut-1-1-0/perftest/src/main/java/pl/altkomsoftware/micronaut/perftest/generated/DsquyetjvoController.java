package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dsquyetjvo")
public class DsquyetjvoController {

    private final DsquyetjvoService dsquyetjvoService;

    public DsquyetjvoController(DsquyetjvoService dsquyetjvoService) {
        this.dsquyetjvoService = dsquyetjvoService;
    }

    @Get("/")
    public String index() {
        return dsquyetjvoService.getGreeting();
    }
}

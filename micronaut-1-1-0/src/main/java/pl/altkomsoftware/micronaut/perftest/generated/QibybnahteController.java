package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qibybnahte")
public class QibybnahteController {

    private final QibybnahteService qibybnahteService;

    public QibybnahteController(QibybnahteService qibybnahteService) {
        this.qibybnahteService = qibybnahteService;
    }

    @Get("/")
    public String index() {
        return qibybnahteService.getGreeting();
    }
}

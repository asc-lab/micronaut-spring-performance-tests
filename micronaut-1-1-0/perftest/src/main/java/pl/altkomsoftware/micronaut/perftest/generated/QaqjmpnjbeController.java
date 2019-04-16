package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qaqjmpnjbe")
public class QaqjmpnjbeController {

    private final QaqjmpnjbeService qaqjmpnjbeService;

    public QaqjmpnjbeController(QaqjmpnjbeService qaqjmpnjbeService) {
        this.qaqjmpnjbeService = qaqjmpnjbeService;
    }

    @Get("/")
    public String index() {
        return qaqjmpnjbeService.getGreeting();
    }
}

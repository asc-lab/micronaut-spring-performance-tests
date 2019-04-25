package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qgloixvbic")
public class QgloixvbicController {

    private final QgloixvbicService qgloixvbicService;

    public QgloixvbicController(QgloixvbicService qgloixvbicService) {
        this.qgloixvbicService = qgloixvbicService;
    }

    @Get("/")
    public String index() {
        return qgloixvbicService.getGreeting();
    }
}

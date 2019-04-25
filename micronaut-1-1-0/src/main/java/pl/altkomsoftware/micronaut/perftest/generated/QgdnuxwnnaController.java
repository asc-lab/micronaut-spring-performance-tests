package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qgdnuxwnna")
public class QgdnuxwnnaController {

    private final QgdnuxwnnaService qgdnuxwnnaService;

    public QgdnuxwnnaController(QgdnuxwnnaService qgdnuxwnnaService) {
        this.qgdnuxwnnaService = qgdnuxwnnaService;
    }

    @Get("/")
    public String index() {
        return qgdnuxwnnaService.getGreeting();
    }
}

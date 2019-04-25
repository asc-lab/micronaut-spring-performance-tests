package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qtzwgorlpe")
public class QtzwgorlpeController {

    private final QtzwgorlpeService qtzwgorlpeService;

    public QtzwgorlpeController(QtzwgorlpeService qtzwgorlpeService) {
        this.qtzwgorlpeService = qtzwgorlpeService;
    }

    @Get("/")
    public String index() {
        return qtzwgorlpeService.getGreeting();
    }
}

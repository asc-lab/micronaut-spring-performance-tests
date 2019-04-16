package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qfhxytbtba")
public class QfhxytbtbaController {

    private final QfhxytbtbaService qfhxytbtbaService;

    public QfhxytbtbaController(QfhxytbtbaService qfhxytbtbaService) {
        this.qfhxytbtbaService = qfhxytbtbaService;
    }

    @Get("/")
    public String index() {
        return qfhxytbtbaService.getGreeting();
    }
}

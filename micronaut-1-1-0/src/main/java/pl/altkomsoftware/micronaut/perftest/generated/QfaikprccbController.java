package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qfaikprccb")
public class QfaikprccbController {

    private final QfaikprccbService qfaikprccbService;

    public QfaikprccbController(QfaikprccbService qfaikprccbService) {
        this.qfaikprccbService = qfaikprccbService;
    }

    @Get("/")
    public String index() {
        return qfaikprccbService.getGreeting();
    }
}

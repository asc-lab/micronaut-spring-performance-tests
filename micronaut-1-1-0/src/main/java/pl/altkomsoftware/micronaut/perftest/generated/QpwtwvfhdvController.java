package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qpwtwvfhdv")
public class QpwtwvfhdvController {

    private final QpwtwvfhdvService qpwtwvfhdvService;

    public QpwtwvfhdvController(QpwtwvfhdvService qpwtwvfhdvService) {
        this.qpwtwvfhdvService = qpwtwvfhdvService;
    }

    @Get("/")
    public String index() {
        return qpwtwvfhdvService.getGreeting();
    }
}

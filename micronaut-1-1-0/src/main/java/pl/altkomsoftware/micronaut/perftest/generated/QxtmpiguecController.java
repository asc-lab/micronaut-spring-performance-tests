package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qxtmpiguec")
public class QxtmpiguecController {

    private final QxtmpiguecService qxtmpiguecService;

    public QxtmpiguecController(QxtmpiguecService qxtmpiguecService) {
        this.qxtmpiguecService = qxtmpiguecService;
    }

    @Get("/")
    public String index() {
        return qxtmpiguecService.getGreeting();
    }
}

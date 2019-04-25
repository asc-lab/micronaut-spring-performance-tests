package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qjtoobhebl")
public class QjtoobheblController {

    private final QjtoobheblService qjtoobheblService;

    public QjtoobheblController(QjtoobheblService qjtoobheblService) {
        this.qjtoobheblService = qjtoobheblService;
    }

    @Get("/")
    public String index() {
        return qjtoobheblService.getGreeting();
    }
}

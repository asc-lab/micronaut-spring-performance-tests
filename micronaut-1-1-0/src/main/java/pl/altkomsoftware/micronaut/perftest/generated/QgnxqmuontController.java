package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qgnxqmuont")
public class QgnxqmuontController {

    private final QgnxqmuontService qgnxqmuontService;

    public QgnxqmuontController(QgnxqmuontService qgnxqmuontService) {
        this.qgnxqmuontService = qgnxqmuontService;
    }

    @Get("/")
    public String index() {
        return qgnxqmuontService.getGreeting();
    }
}

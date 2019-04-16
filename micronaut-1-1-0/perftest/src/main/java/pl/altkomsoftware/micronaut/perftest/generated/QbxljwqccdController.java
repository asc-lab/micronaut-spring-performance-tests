package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qbxljwqccd")
public class QbxljwqccdController {

    private final QbxljwqccdService qbxljwqccdService;

    public QbxljwqccdController(QbxljwqccdService qbxljwqccdService) {
        this.qbxljwqccdService = qbxljwqccdService;
    }

    @Get("/")
    public String index() {
        return qbxljwqccdService.getGreeting();
    }
}

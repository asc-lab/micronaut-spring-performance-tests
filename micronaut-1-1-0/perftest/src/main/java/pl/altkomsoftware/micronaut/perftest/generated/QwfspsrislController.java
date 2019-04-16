package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qwfspsrisl")
public class QwfspsrislController {

    private final QwfspsrislService qwfspsrislService;

    public QwfspsrislController(QwfspsrislService qwfspsrislService) {
        this.qwfspsrislService = qwfspsrislService;
    }

    @Get("/")
    public String index() {
        return qwfspsrislService.getGreeting();
    }
}

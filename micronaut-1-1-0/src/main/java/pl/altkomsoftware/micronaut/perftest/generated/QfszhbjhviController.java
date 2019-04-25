package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qfszhbjhvi")
public class QfszhbjhviController {

    private final QfszhbjhviService qfszhbjhviService;

    public QfszhbjhviController(QfszhbjhviService qfszhbjhviService) {
        this.qfszhbjhviService = qfszhbjhviService;
    }

    @Get("/")
    public String index() {
        return qfszhbjhviService.getGreeting();
    }
}

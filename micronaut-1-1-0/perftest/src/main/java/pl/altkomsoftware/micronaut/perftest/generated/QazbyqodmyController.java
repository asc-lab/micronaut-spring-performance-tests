package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qazbyqodmy")
public class QazbyqodmyController {

    private final QazbyqodmyService qazbyqodmyService;

    public QazbyqodmyController(QazbyqodmyService qazbyqodmyService) {
        this.qazbyqodmyService = qazbyqodmyService;
    }

    @Get("/")
    public String index() {
        return qazbyqodmyService.getGreeting();
    }
}

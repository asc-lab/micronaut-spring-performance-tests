package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qcxitifpic")
public class QcxitifpicController {

    private final QcxitifpicService qcxitifpicService;

    public QcxitifpicController(QcxitifpicService qcxitifpicService) {
        this.qcxitifpicService = qcxitifpicService;
    }

    @Get("/")
    public String index() {
        return qcxitifpicService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qvyouoland")
public class QvyouolandController {

    private final QvyouolandService qvyouolandService;

    public QvyouolandController(QvyouolandService qvyouolandService) {
        this.qvyouolandService = qvyouolandService;
    }

    @Get("/")
    public String index() {
        return qvyouolandService.getGreeting();
    }
}

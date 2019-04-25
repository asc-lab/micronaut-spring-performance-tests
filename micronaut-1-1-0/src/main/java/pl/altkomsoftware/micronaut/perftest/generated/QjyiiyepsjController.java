package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qjyiiyepsj")
public class QjyiiyepsjController {

    private final QjyiiyepsjService qjyiiyepsjService;

    public QjyiiyepsjController(QjyiiyepsjService qjyiiyepsjService) {
        this.qjyiiyepsjService = qjyiiyepsjService;
    }

    @Get("/")
    public String index() {
        return qjyiiyepsjService.getGreeting();
    }
}

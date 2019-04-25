package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qbokbnarll")
public class QbokbnarllController {

    private final QbokbnarllService qbokbnarllService;

    public QbokbnarllController(QbokbnarllService qbokbnarllService) {
        this.qbokbnarllService = qbokbnarllService;
    }

    @Get("/")
    public String index() {
        return qbokbnarllService.getGreeting();
    }
}

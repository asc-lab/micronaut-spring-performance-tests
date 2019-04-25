package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qczmktnmgl")
public class QczmktnmglController {

    private final QczmktnmglService qczmktnmglService;

    public QczmktnmglController(QczmktnmglService qczmktnmglService) {
        this.qczmktnmglService = qczmktnmglService;
    }

    @Get("/")
    public String index() {
        return qczmktnmglService.getGreeting();
    }
}

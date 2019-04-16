package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qvvumipwgj")
public class QvvumipwgjController {

    private final QvvumipwgjService qvvumipwgjService;

    public QvvumipwgjController(QvvumipwgjService qvvumipwgjService) {
        this.qvvumipwgjService = qvvumipwgjService;
    }

    @Get("/")
    public String index() {
        return qvvumipwgjService.getGreeting();
    }
}

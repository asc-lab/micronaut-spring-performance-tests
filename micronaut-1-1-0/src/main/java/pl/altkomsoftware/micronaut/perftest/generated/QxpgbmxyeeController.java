package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qxpgbmxyee")
public class QxpgbmxyeeController {

    private final QxpgbmxyeeService qxpgbmxyeeService;

    public QxpgbmxyeeController(QxpgbmxyeeService qxpgbmxyeeService) {
        this.qxpgbmxyeeService = qxpgbmxyeeService;
    }

    @Get("/")
    public String index() {
        return qxpgbmxyeeService.getGreeting();
    }
}

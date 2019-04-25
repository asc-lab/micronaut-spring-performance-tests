package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qwvlqkjowm")
public class QwvlqkjowmController {

    private final QwvlqkjowmService qwvlqkjowmService;

    public QwvlqkjowmController(QwvlqkjowmService qwvlqkjowmService) {
        this.qwvlqkjowmService = qwvlqkjowmService;
    }

    @Get("/")
    public String index() {
        return qwvlqkjowmService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qyvvkospxk")
public class QyvvkospxkController {

    private final QyvvkospxkService qyvvkospxkService;

    public QyvvkospxkController(QyvvkospxkService qyvvkospxkService) {
        this.qyvvkospxkService = qyvvkospxkService;
    }

    @Get("/")
    public String index() {
        return qyvvkospxkService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qantomqygv")
public class QantomqygvController {

    private final QantomqygvService qantomqygvService;

    public QantomqygvController(QantomqygvService qantomqygvService) {
        this.qantomqygvService = qantomqygvService;
    }

    @Get("/")
    public String index() {
        return qantomqygvService.getGreeting();
    }
}

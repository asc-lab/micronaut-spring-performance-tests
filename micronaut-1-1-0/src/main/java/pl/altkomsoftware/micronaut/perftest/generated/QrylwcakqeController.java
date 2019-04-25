package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qrylwcakqe")
public class QrylwcakqeController {

    private final QrylwcakqeService qrylwcakqeService;

    public QrylwcakqeController(QrylwcakqeService qrylwcakqeService) {
        this.qrylwcakqeService = qrylwcakqeService;
    }

    @Get("/")
    public String index() {
        return qrylwcakqeService.getGreeting();
    }
}

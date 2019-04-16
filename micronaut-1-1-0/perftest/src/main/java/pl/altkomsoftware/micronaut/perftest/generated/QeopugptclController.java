package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qeopugptcl")
public class QeopugptclController {

    private final QeopugptclService qeopugptclService;

    public QeopugptclController(QeopugptclService qeopugptclService) {
        this.qeopugptclService = qeopugptclService;
    }

    @Get("/")
    public String index() {
        return qeopugptclService.getGreeting();
    }
}

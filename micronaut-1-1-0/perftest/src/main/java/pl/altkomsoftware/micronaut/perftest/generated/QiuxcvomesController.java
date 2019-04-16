package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qiuxcvomes")
public class QiuxcvomesController {

    private final QiuxcvomesService qiuxcvomesService;

    public QiuxcvomesController(QiuxcvomesService qiuxcvomesService) {
        this.qiuxcvomesService = qiuxcvomesService;
    }

    @Get("/")
    public String index() {
        return qiuxcvomesService.getGreeting();
    }
}

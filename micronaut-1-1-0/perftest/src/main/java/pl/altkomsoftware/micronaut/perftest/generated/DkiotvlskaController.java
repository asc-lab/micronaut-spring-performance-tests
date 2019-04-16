package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dkiotvlska")
public class DkiotvlskaController {

    private final DkiotvlskaService dkiotvlskaService;

    public DkiotvlskaController(DkiotvlskaService dkiotvlskaService) {
        this.dkiotvlskaService = dkiotvlskaService;
    }

    @Get("/")
    public String index() {
        return dkiotvlskaService.getGreeting();
    }
}

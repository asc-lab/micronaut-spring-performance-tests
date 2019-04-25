package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/duvpgjjbdf")
public class DuvpgjjbdfController {

    private final DuvpgjjbdfService duvpgjjbdfService;

    public DuvpgjjbdfController(DuvpgjjbdfService duvpgjjbdfService) {
        this.duvpgjjbdfService = duvpgjjbdfService;
    }

    @Get("/")
    public String index() {
        return duvpgjjbdfService.getGreeting();
    }
}

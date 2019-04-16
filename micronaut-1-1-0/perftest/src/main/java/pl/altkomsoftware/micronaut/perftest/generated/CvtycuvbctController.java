package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cvtycuvbct")
public class CvtycuvbctController {

    private final CvtycuvbctService cvtycuvbctService;

    public CvtycuvbctController(CvtycuvbctService cvtycuvbctService) {
        this.cvtycuvbctService = cvtycuvbctService;
    }

    @Get("/")
    public String index() {
        return cvtycuvbctService.getGreeting();
    }
}

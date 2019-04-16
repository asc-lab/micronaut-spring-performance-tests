package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/upnjvcwufr")
public class UpnjvcwufrController {

    private final UpnjvcwufrService upnjvcwufrService;

    public UpnjvcwufrController(UpnjvcwufrService upnjvcwufrService) {
        this.upnjvcwufrService = upnjvcwufrService;
    }

    @Get("/")
    public String index() {
        return upnjvcwufrService.getGreeting();
    }
}

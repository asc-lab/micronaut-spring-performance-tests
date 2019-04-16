package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gcvvwrrqny")
public class GcvvwrrqnyController {

    private final GcvvwrrqnyService gcvvwrrqnyService;

    public GcvvwrrqnyController(GcvvwrrqnyService gcvvwrrqnyService) {
        this.gcvvwrrqnyService = gcvvwrrqnyService;
    }

    @Get("/")
    public String index() {
        return gcvvwrrqnyService.getGreeting();
    }
}

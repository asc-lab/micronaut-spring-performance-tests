package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dutbaihfnk")
public class DutbaihfnkController {

    private final DutbaihfnkService dutbaihfnkService;

    public DutbaihfnkController(DutbaihfnkService dutbaihfnkService) {
        this.dutbaihfnkService = dutbaihfnkService;
    }

    @Get("/")
    public String index() {
        return dutbaihfnkService.getGreeting();
    }
}

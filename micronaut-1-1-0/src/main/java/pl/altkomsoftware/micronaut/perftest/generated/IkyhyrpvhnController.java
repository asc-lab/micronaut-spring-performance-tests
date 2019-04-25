package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ikyhyrpvhn")
public class IkyhyrpvhnController {

    private final IkyhyrpvhnService ikyhyrpvhnService;

    public IkyhyrpvhnController(IkyhyrpvhnService ikyhyrpvhnService) {
        this.ikyhyrpvhnService = ikyhyrpvhnService;
    }

    @Get("/")
    public String index() {
        return ikyhyrpvhnService.getGreeting();
    }
}

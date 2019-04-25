package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iehyzsuoti")
public class IehyzsuotiController {

    private final IehyzsuotiService iehyzsuotiService;

    public IehyzsuotiController(IehyzsuotiService iehyzsuotiService) {
        this.iehyzsuotiService = iehyzsuotiService;
    }

    @Get("/")
    public String index() {
        return iehyzsuotiService.getGreeting();
    }
}

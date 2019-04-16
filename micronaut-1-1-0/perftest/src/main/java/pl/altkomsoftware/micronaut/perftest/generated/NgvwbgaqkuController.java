package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ngvwbgaqku")
public class NgvwbgaqkuController {

    private final NgvwbgaqkuService ngvwbgaqkuService;

    public NgvwbgaqkuController(NgvwbgaqkuService ngvwbgaqkuService) {
        this.ngvwbgaqkuService = ngvwbgaqkuService;
    }

    @Get("/")
    public String index() {
        return ngvwbgaqkuService.getGreeting();
    }
}

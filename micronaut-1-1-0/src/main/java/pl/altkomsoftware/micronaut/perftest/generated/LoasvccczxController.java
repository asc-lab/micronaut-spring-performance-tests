package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/loasvccczx")
public class LoasvccczxController {

    private final LoasvccczxService loasvccczxService;

    public LoasvccczxController(LoasvccczxService loasvccczxService) {
        this.loasvccczxService = loasvccczxService;
    }

    @Get("/")
    public String index() {
        return loasvccczxService.getGreeting();
    }
}

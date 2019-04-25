package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ecyxorqadi")
public class EcyxorqadiController {

    private final EcyxorqadiService ecyxorqadiService;

    public EcyxorqadiController(EcyxorqadiService ecyxorqadiService) {
        this.ecyxorqadiService = ecyxorqadiService;
    }

    @Get("/")
    public String index() {
        return ecyxorqadiService.getGreeting();
    }
}

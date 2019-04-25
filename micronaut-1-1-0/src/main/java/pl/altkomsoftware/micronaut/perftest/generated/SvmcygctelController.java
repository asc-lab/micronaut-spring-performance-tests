package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/svmcygctel")
public class SvmcygctelController {

    private final SvmcygctelService svmcygctelService;

    public SvmcygctelController(SvmcygctelService svmcygctelService) {
        this.svmcygctelService = svmcygctelService;
    }

    @Get("/")
    public String index() {
        return svmcygctelService.getGreeting();
    }
}

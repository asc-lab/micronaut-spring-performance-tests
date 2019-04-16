package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/uoqzjizjqq")
public class UoqzjizjqqController {

    private final UoqzjizjqqService uoqzjizjqqService;

    public UoqzjizjqqController(UoqzjizjqqService uoqzjizjqqService) {
        this.uoqzjizjqqService = uoqzjizjqqService;
    }

    @Get("/")
    public String index() {
        return uoqzjizjqqService.getGreeting();
    }
}

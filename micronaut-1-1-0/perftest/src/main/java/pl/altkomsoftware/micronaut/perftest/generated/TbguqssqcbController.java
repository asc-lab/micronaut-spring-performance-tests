package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tbguqssqcb")
public class TbguqssqcbController {

    private final TbguqssqcbService tbguqssqcbService;

    public TbguqssqcbController(TbguqssqcbService tbguqssqcbService) {
        this.tbguqssqcbService = tbguqssqcbService;
    }

    @Get("/")
    public String index() {
        return tbguqssqcbService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tbfaoqwgtn")
public class TbfaoqwgtnController {

    private final TbfaoqwgtnService tbfaoqwgtnService;

    public TbfaoqwgtnController(TbfaoqwgtnService tbfaoqwgtnService) {
        this.tbfaoqwgtnService = tbfaoqwgtnService;
    }

    @Get("/")
    public String index() {
        return tbfaoqwgtnService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/tbrlbflicc")
public class TbrlbfliccController {

    private final TbrlbfliccService tbrlbfliccService;

    public TbrlbfliccController(TbrlbfliccService tbrlbfliccService) {
        this.tbrlbfliccService = tbrlbfliccService;
    }

    @Get("/")
    public String index() {
        return tbrlbfliccService.getGreeting();
    }
}

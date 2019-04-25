package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/wscmmxsxoa")
public class WscmmxsxoaController {

    private final WscmmxsxoaService wscmmxsxoaService;

    public WscmmxsxoaController(WscmmxsxoaService wscmmxsxoaService) {
        this.wscmmxsxoaService = wscmmxsxoaService;
    }

    @Get("/")
    public String index() {
        return wscmmxsxoaService.getGreeting();
    }
}

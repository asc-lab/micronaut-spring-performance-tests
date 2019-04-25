package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/dswbwezpoa")
public class DswbwezpoaController {

    private final DswbwezpoaService dswbwezpoaService;

    public DswbwezpoaController(DswbwezpoaService dswbwezpoaService) {
        this.dswbwezpoaService = dswbwezpoaService;
    }

    @Get("/")
    public String index() {
        return dswbwezpoaService.getGreeting();
    }
}

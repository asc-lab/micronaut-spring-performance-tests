package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/iohavldjua")
public class IohavldjuaController {

    private final IohavldjuaService iohavldjuaService;

    public IohavldjuaController(IohavldjuaService iohavldjuaService) {
        this.iohavldjuaService = iohavldjuaService;
    }

    @Get("/")
    public String index() {
        return iohavldjuaService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/jtirwuruua")
public class JtirwuruuaController {

    private final JtirwuruuaService jtirwuruuaService;

    public JtirwuruuaController(JtirwuruuaService jtirwuruuaService) {
        this.jtirwuruuaService = jtirwuruuaService;
    }

    @Get("/")
    public String index() {
        return jtirwuruuaService.getGreeting();
    }
}

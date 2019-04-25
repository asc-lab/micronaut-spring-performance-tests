package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ickddczxro")
public class IckddczxroController {

    private final IckddczxroService ickddczxroService;

    public IckddczxroController(IckddczxroService ickddczxroService) {
        this.ickddczxroService = ickddczxroService;
    }

    @Get("/")
    public String index() {
        return ickddczxroService.getGreeting();
    }
}

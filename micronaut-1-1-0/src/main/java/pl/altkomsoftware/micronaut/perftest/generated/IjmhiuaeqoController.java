package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ijmhiuaeqo")
public class IjmhiuaeqoController {

    private final IjmhiuaeqoService ijmhiuaeqoService;

    public IjmhiuaeqoController(IjmhiuaeqoService ijmhiuaeqoService) {
        this.ijmhiuaeqoService = ijmhiuaeqoService;
    }

    @Get("/")
    public String index() {
        return ijmhiuaeqoService.getGreeting();
    }
}

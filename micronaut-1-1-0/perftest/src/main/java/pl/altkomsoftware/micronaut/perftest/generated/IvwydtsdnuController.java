package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ivwydtsdnu")
public class IvwydtsdnuController {

    private final IvwydtsdnuService ivwydtsdnuService;

    public IvwydtsdnuController(IvwydtsdnuService ivwydtsdnuService) {
        this.ivwydtsdnuService = ivwydtsdnuService;
    }

    @Get("/")
    public String index() {
        return ivwydtsdnuService.getGreeting();
    }
}

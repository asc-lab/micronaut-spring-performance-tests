package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/itgfrfxrao")
public class ItgfrfxraoController {

    private final ItgfrfxraoService itgfrfxraoService;

    public ItgfrfxraoController(ItgfrfxraoService itgfrfxraoService) {
        this.itgfrfxraoService = itgfrfxraoService;
    }

    @Get("/")
    public String index() {
        return itgfrfxraoService.getGreeting();
    }
}

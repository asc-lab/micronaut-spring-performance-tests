package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gxadtyhfth")
public class GxadtyhfthController {

    private final GxadtyhfthService gxadtyhfthService;

    public GxadtyhfthController(GxadtyhfthService gxadtyhfthService) {
        this.gxadtyhfthService = gxadtyhfthService;
    }

    @Get("/")
    public String index() {
        return gxadtyhfthService.getGreeting();
    }
}

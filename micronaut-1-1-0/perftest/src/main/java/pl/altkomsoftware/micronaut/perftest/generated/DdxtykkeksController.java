package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ddxtykkeks")
public class DdxtykkeksController {

    private final DdxtykkeksService ddxtykkeksService;

    public DdxtykkeksController(DdxtykkeksService ddxtykkeksService) {
        this.ddxtykkeksService = ddxtykkeksService;
    }

    @Get("/")
    public String index() {
        return ddxtykkeksService.getGreeting();
    }
}

package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/qkgfadrgfp")
public class QkgfadrgfpController {

    private final QkgfadrgfpService qkgfadrgfpService;

    public QkgfadrgfpController(QkgfadrgfpService qkgfadrgfpService) {
        this.qkgfadrgfpService = qkgfadrgfpService;
    }

    @Get("/")
    public String index() {
        return qkgfadrgfpService.getGreeting();
    }
}

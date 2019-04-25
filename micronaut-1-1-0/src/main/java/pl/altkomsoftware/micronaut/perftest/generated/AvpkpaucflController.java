package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/avpkpaucfl")
public class AvpkpaucflController {

    private final AvpkpaucflService avpkpaucflService;

    public AvpkpaucflController(AvpkpaucflService avpkpaucflService) {
        this.avpkpaucflService = avpkpaucflService;
    }

    @Get("/")
    public String index() {
        return avpkpaucflService.getGreeting();
    }
}

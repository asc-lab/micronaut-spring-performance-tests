package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/mtvnopcqni")
public class MtvnopcqniController {

    private final MtvnopcqniService mtvnopcqniService;

    public MtvnopcqniController(MtvnopcqniService mtvnopcqniService) {
        this.mtvnopcqniService = mtvnopcqniService;
    }

    @Get("/")
    public String index() {
        return mtvnopcqniService.getGreeting();
    }
}

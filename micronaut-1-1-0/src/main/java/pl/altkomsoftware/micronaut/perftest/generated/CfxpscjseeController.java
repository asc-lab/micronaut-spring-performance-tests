package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/cfxpscjsee")
public class CfxpscjseeController {

    private final CfxpscjseeService cfxpscjseeService;

    public CfxpscjseeController(CfxpscjseeService cfxpscjseeService) {
        this.cfxpscjseeService = cfxpscjseeService;
    }

    @Get("/")
    public String index() {
        return cfxpscjseeService.getGreeting();
    }
}

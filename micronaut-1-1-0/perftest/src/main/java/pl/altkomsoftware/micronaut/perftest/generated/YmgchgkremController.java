package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ymgchgkrem")
public class YmgchgkremController {

    private final YmgchgkremService ymgchgkremService;

    public YmgchgkremController(YmgchgkremService ymgchgkremService) {
        this.ymgchgkremService = ymgchgkremService;
    }

    @Get("/")
    public String index() {
        return ymgchgkremService.getGreeting();
    }
}

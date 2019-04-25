package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/yyiwfekqry")
public class YyiwfekqryController {

    private final YyiwfekqryService yyiwfekqryService;

    public YyiwfekqryController(YyiwfekqryService yyiwfekqryService) {
        this.yyiwfekqryService = yyiwfekqryService;
    }

    @Get("/")
    public String index() {
        return yyiwfekqryService.getGreeting();
    }
}

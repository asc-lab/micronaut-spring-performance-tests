package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/gnvmugvdjf")
public class GnvmugvdjfController {

    private final GnvmugvdjfService gnvmugvdjfService;

    public GnvmugvdjfController(GnvmugvdjfService gnvmugvdjfService) {
        this.gnvmugvdjfService = gnvmugvdjfService;
    }

    @Get("/")
    public String index() {
        return gnvmugvdjfService.getGreeting();
    }
}

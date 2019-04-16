package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/hksynlhebl")
public class HksynlheblController {

    private final HksynlheblService hksynlheblService;

    public HksynlheblController(HksynlheblService hksynlheblService) {
        this.hksynlheblService = hksynlheblService;
    }

    @Get("/")
    public String index() {
        return hksynlheblService.getGreeting();
    }
}

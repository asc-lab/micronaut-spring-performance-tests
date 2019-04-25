package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/ntlzpiamar")
public class NtlzpiamarController {

    private final NtlzpiamarService ntlzpiamarService;

    public NtlzpiamarController(NtlzpiamarService ntlzpiamarService) {
        this.ntlzpiamarService = ntlzpiamarService;
    }

    @Get("/")
    public String index() {
        return ntlzpiamarService.getGreeting();
    }
}

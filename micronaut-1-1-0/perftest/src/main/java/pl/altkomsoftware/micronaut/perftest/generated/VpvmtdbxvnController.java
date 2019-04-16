package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/vpvmtdbxvn")
public class VpvmtdbxvnController {

    private final VpvmtdbxvnService vpvmtdbxvnService;

    public VpvmtdbxvnController(VpvmtdbxvnService vpvmtdbxvnService) {
        this.vpvmtdbxvnService = vpvmtdbxvnService;
    }

    @Get("/")
    public String index() {
        return vpvmtdbxvnService.getGreeting();
    }
}

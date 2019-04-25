package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oolzjorlcp")
public class OolzjorlcpController {

    private final OolzjorlcpService oolzjorlcpService;

    public OolzjorlcpController(OolzjorlcpService oolzjorlcpService) {
        this.oolzjorlcpService = oolzjorlcpService;
    }

    @Get("/")
    public String index() {
        return oolzjorlcpService.getGreeting();
    }
}

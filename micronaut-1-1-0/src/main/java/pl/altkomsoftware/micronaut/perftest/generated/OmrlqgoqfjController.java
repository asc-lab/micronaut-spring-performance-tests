package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/omrlqgoqfj")
public class OmrlqgoqfjController {

    private final OmrlqgoqfjService omrlqgoqfjService;

    public OmrlqgoqfjController(OmrlqgoqfjService omrlqgoqfjService) {
        this.omrlqgoqfjService = omrlqgoqfjService;
    }

    @Get("/")
    public String index() {
        return omrlqgoqfjService.getGreeting();
    }
}

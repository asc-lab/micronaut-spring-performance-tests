package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/xneobybsjf")
public class XneobybsjfController {

    private final XneobybsjfService xneobybsjfService;

    public XneobybsjfController(XneobybsjfService xneobybsjfService) {
        this.xneobybsjfService = xneobybsjfService;
    }

    @Get("/")
    public String index() {
        return xneobybsjfService.getGreeting();
    }
}

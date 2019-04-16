package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/oamsayblxa")
public class OamsayblxaController {

    private final OamsayblxaService oamsayblxaService;

    public OamsayblxaController(OamsayblxaService oamsayblxaService) {
        this.oamsayblxaService = oamsayblxaService;
    }

    @Get("/")
    public String index() {
        return oamsayblxaService.getGreeting();
    }
}

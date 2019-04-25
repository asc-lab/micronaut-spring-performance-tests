package pl.altkomsoftware.micronaut.perftest.generated;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;

@Controller("/myoeaouamw")
public class MyoeaouamwController {

    private final MyoeaouamwService myoeaouamwService;

    public MyoeaouamwController(MyoeaouamwService myoeaouamwService) {
        this.myoeaouamwService = myoeaouamwService;
    }

    @Get("/")
    public String index() {
        return myoeaouamwService.getGreeting();
    }
}

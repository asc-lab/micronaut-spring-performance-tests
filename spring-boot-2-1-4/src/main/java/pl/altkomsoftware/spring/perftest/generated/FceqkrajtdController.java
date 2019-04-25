package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FceqkrajtdController {

    private final FceqkrajtdService fceqkrajtdService;

    public FceqkrajtdController(FceqkrajtdService fceqkrajtdService) {
        this.fceqkrajtdService = fceqkrajtdService;
    }

    @RequestMapping("/fceqkrajtd")
    public String index() {
        return fceqkrajtdService.getGreeting();
    }

}

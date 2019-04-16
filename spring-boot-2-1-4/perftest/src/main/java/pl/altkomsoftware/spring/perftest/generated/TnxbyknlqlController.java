package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TnxbyknlqlController {

    private final TnxbyknlqlService tnxbyknlqlService;

    public TnxbyknlqlController(TnxbyknlqlService tnxbyknlqlService) {
        this.tnxbyknlqlService = tnxbyknlqlService;
    }

    @RequestMapping("/tnxbyknlql")
    public String index() {
        return tnxbyknlqlService.getGreeting();
    }

}

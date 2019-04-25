package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class OqmquhdsutController {

    private final OqmquhdsutService oqmquhdsutService;

    public OqmquhdsutController(OqmquhdsutService oqmquhdsutService) {
        this.oqmquhdsutService = oqmquhdsutService;
    }

    @RequestMapping("/oqmquhdsut")
    public String index() {
        return oqmquhdsutService.getGreeting();
    }

}

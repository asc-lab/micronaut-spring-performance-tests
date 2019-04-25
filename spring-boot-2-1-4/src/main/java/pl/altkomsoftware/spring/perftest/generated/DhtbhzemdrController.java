package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DhtbhzemdrController {

    private final DhtbhzemdrService dhtbhzemdrService;

    public DhtbhzemdrController(DhtbhzemdrService dhtbhzemdrService) {
        this.dhtbhzemdrService = dhtbhzemdrService;
    }

    @RequestMapping("/dhtbhzemdr")
    public String index() {
        return dhtbhzemdrService.getGreeting();
    }

}

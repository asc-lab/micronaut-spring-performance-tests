package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GjpvaivazkController {

    private final GjpvaivazkService gjpvaivazkService;

    public GjpvaivazkController(GjpvaivazkService gjpvaivazkService) {
        this.gjpvaivazkService = gjpvaivazkService;
    }

    @RequestMapping("/gjpvaivazk")
    public String index() {
        return gjpvaivazkService.getGreeting();
    }

}

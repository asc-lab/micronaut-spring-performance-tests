package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class KnvxdwayweController {

    private final KnvxdwayweService knvxdwayweService;

    public KnvxdwayweController(KnvxdwayweService knvxdwayweService) {
        this.knvxdwayweService = knvxdwayweService;
    }

    @RequestMapping("/knvxdwaywe")
    public String index() {
        return knvxdwayweService.getGreeting();
    }

}

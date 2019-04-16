package pl.altkomsoftware.spring.perftest.generated;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class BzooaougjaController {

    private final BzooaougjaService bzooaougjaService;

    public BzooaougjaController(BzooaougjaService bzooaougjaService) {
        this.bzooaougjaService = bzooaougjaService;
    }

    @RequestMapping("/bzooaougja")
    public String index() {
        return bzooaougjaService.getGreeting();
    }

}
